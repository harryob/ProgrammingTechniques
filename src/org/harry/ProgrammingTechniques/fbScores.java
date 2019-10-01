package org.harry.ProgrammingTechniques;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class fbScores {
    public static void main(String[] args){
        readFile();
    }

    private static boolean checkCharacters(String checkChar, boolean checkNum){
        String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] numbers = {"1","2","3","4","5","6","7","8","9","10"};

        if(checkNum){
            for (String number : numbers) {
                return checkChar.contains(number);
            }
        }
        else{
            for (String s : alphabet) {
                return checkChar.contains(s);
            }
        }
        return true;
    }

    private static void readFile(){

        int failCount = 0;

        try{FileReader readFile = new FileReader("resources/fbScores.txt");
        Scanner fileScan = new Scanner(readFile);
        
        while(fileScan.hasNextLine()) {
            String strSplit = fileScan.nextLine();
            String[] arrSplit = strSplit.split(":");

            int counter = 0;

            for (String s : arrSplit) {
                if (s != null) {
                    counter++;
                }
            }

            System.out.println(counter);

            if(counter != 4){
                System.out.println("Fail, poorly formatted results. Requires Team:Team:Score:Score");
            }else {
                if (" ".equals(arrSplit[0]) || " ".equals(arrSplit[1]) || " ".equals(arrSplit[2]) || " ".equals(arrSplit[3]) || "".equals(arrSplit[0]) || "".equals(arrSplit[1]) || "".equals(arrSplit[2]) || "".equals(arrSplit[3])) {
                    System.out.println("Fail, empty characters detected.");
                    failCount += 1;
                }
                if (checkCharacters(arrSplit[0], true) || checkCharacters(arrSplit[1], true)) {
                    System.out.println("Fail, team name contains numbers.");
                    failCount += 1;
                }
                if (checkCharacters(arrSplit[2], false) || checkCharacters(arrSplit[3], false)) {
                    System.out.println("Fail, score contains letters in " + arrSplit[0]);
                    failCount += 1;
                } else {
                    System.out.println(Arrays.toString(arrSplit));
                }
            }
            }

        System.out.println("Total no. of errors: " + failCount);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }}