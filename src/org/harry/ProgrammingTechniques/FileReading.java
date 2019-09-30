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
}
