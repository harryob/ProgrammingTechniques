package org.harry.ProgrammingTechniques;

import java.io.*;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) throws IOException{
        
        FileReader file = new FileReader("resources/writing.txt");
        Scanner fileScan = new Scanner(file);
        
        while(fileScan.hasNextLine()){
            System.out.println(fileScan.nextLine());
        }
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
    
}
