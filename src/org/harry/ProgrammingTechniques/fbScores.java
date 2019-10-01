package org.harry.ProgrammingTechniques;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fbScores {
    public static void main(String[] args){
        Scanner newObj = new Scanner(System.in);

        System.out.println("Output as (HTML) or (.txt)?");
        String choice = newObj.nextLine();

        boolean choiceB = choice.equals("HTML");

        readFile(choiceB);
    }

    private static boolean checkCharacters(String checkChar, boolean checkNum){
        String alphabet = "[a-zA-Z]";
        String numbers = "[1-9]";

        if(checkNum){
            //checking if TEAM NAME has NUMBERS

            Pattern r = Pattern.compile(numbers);
            Matcher m = r.matcher(checkChar);

            return m.find();
        }
        if(!checkNum){
            //checking if SCORE has ALPHABET

            Pattern r = Pattern.compile(alphabet);
            Matcher m = r.matcher(checkChar);

            return m.find();
        }

        return false;
    }

    private static void readFile(Boolean choiceB){

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

            if(counter != 4) System.out.println("Fail, poorly formatted results. Requires Team:Team:Score:Score");
            else {
                if (" ".equals(arrSplit[0]) || " ".equals(arrSplit[1]) || " ".equals(arrSplit[2]) || " ".equals(arrSplit[3]) || "".equals(arrSplit[0]) || "".equals(arrSplit[1]) || "".equals(arrSplit[2]) || "".equals(arrSplit[3])) {
                    System.out.println("Fail, empty characters detected.");
                    failCount += 1;
                }
                else if (checkCharacters(arrSplit[0], true) || checkCharacters(arrSplit[1], true)) {
                    System.out.println("Fail, team name contains numbers.");
                    failCount += 1;
                }
                else if (checkCharacters(arrSplit[2], false) || checkCharacters(arrSplit[3], false)) {
                    System.out.println("Fail, score contains letters in " + arrSplit[0]);
                    failCount += 1;
                } else {
                    System.out.println(Arrays.toString(arrSplit));

                        String data = "Home Team: " + arrSplit[0] + " Score: " + arrSplit[2] + System.lineSeparator() + "Away Team:" + arrSplit[1] + " Score: " + arrSplit[3] + System.lineSeparator() + System.lineSeparator();
                        writeToFile(data);
                }
            }
            }

        System.out.println("Total no. of errors: " + failCount);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void writeToFile(String data){
        try{
            FileWriter file = new FileWriter("resources/writing.txt", true);
            BufferedWriter buff = new BufferedWriter(file);

            buff.write(data);

            buff.close();
        }
        catch(IOException e){
            System.out.println("The code did an IOException");
        }

    }

}