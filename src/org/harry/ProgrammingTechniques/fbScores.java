package org.harry.ProgrammingTechniques;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class fbScores {
    public static void main(String[] args){
        readFile();
    }
    
    public static void readFile(){
        
        try{FileReader readFile = new FileReader("resources/fbScores.txt");
        Scanner fileScan = new Scanner(readFile);
        
        while(fileScan.hasNextLine()) {
            String strSplit = fileScan.nextLine();
            String[] arrSplit = strSplit.split(":");
            
                
                if(" ".equals(arrSplit[0]) || " ".equals(arrSplit[1]) || " ".equals(arrSplit[2])){
                    System.out.println("Fail.");
                }
                if("".equals(arrSplit[0]) || "".equals(arrSplit[1]) || " ".equals(arrSplit[3])){
                    System.out.println("Fail.");
                }
                
                System.out.println(Arrays.toString(arrSplit));
            }
        }
        
        catch(IOException e){
            System.out.println("error!");
            
        }
                
        }}