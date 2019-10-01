package org.harry.ProgrammingTechniques;

import java.io.*;
import java.util.Scanner;

public class TakeInfo {
    public static void main(String[] args) throws IOException{
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("What's your name?");
        String name = userInput.nextLine();
        
        System.out.println("What's your age?");
        String age = userInput.nextLine();
        
        System.out.println("What's your height?");
        String height = userInput.nextLine();
        
        
        
        String data = name + ":" + age + ":" + height;
        
        writeFile(data);
    }
    
    
    public void readFile(){
        try{FileReader readFile = new FileReader("resources/takeinput.txt");
        Scanner fileScan = new Scanner(readFile);

        while(fileScan.hasNextLine()) {
            String strSplit = fileScan.nextLine();
            String[] arrSplit = strSplit.split(":");
            System.out.println("Name: " + arrSplit[0]);
            System.out.println("Age: " + arrSplit[1]);
            System.out.println("Height: " + arrSplit[2]);
        }
        }
        catch(IOException e){
            System.out.println("IOException Error");
        }
    }
    
    public static void writeFile(String data){
            try{
            FileWriter file = new FileWriter("resources/takeinput.txt", true);
            BufferedWriter buff = new BufferedWriter(file);
            
            buff.write(data + "\n");
            buff.close();
        }
        catch(IOException e){
            System.out.println("IOException Error.");
        }
    }
    
}
