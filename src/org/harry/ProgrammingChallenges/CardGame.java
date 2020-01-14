
package org.harry.ProgrammingChallenges;

import java.util.Scanner;
import java.io.*;
import java.util.Random;
import java.util.*; 


public class CardGame {

    public static void main(String[] args) throws FileNotFoundException{
        PlayGame();
        
        System.out.println("User 1, please enter your details:");
        if(LoginDetails() == true){
            System.out.println("User 1 authorized.");
        }
        else{
            System.out.println("User 1 failed to authorize.");
        }
        
        System.out.println("user 2, please enter your details:");
        if(LoginDetails() == true){
            System.out.println("User 2 authorized.");
        }
        else{
            System.out.println("User 2 failed to authorize.");
        }
        
        PlayGame();

    }

    public static boolean LoginDetails() throws FileNotFoundException{
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("What's your username?");
        String name = userInput.nextLine();
        
        System.out.println("What's your password?");
        String password = userInput.nextLine();
        
        
        FileReader readFile = new FileReader("resources/details.txt");
        Scanner fileScan = new Scanner(readFile);
        
        while(fileScan.hasNextLine()){
            String strSplit = fileScan.nextLine();
            String[] arrSplit = strSplit.split(":");
            
            if(arrSplit[0] == name){
                if(arrSplit[1] == password){
                    System.out.println("User authorized.");
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return false;
        
    }

    private static void PlayGame() {
        String[][] cards = {{"RED","1"},{"RED", "2"},{"RED", "3"},{"RED", "4"},{"RED", "5"},{"RED", "6"},{"RED", "7"},{"RED","8"},{"RED","9"},{"RED", "10"},{"YELLOW","1"},{"YELLOW", "2"},{"YELLOW", "3"},{"YELLOW", "4"},{"YELLOW", "5"},{"YELLOW", "6"},{"YELLOW", "7"},{"YELLOW","8"},{"YELLOW","9"},{"YELLOW", "10"},{"BLACK","1"},{"BLACK", "2"},{"BLACK", "3"},{"BLACK", "4"},{"BLACK", "5"},{"BLACK", "6"},{"BLACK", "7"},{"BLACK","8"},{"BLACK","9"},{"BLACK", "10"}};
        
        ArrayList<Integer> arrList = new ArrayList<>();
        
        Random rand = new Random();
        
        for(int i=1;i<=30;i++){  
        arrList.add(rand.nextInt(30));
        }
        
        int[] order = convertIntegers(arrList);
        
        System.out.println("User 1 takes a card.");
        String userOneCard = Arrays.toString(cards[order[1]]);
        System.out.println("The card is " + userOneCard);
        
        System.out.println("User 2 takes a card.");
        String userTwoCard = Arrays.toString(cards[order[1]]);
        
    }
    
    public static int[] convertIntegers(List<Integer> integers)
    {
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }
    
}
