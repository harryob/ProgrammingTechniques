package org.harry;

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
        
        try{
            FileWriter file = new FileWriter("resources/takeinput.txt");
            BufferedWriter buff = new BufferedWriter(file);
            
            buff.write(data + "\n");
            
            buff.close();
        }
        catch(IOException e){
            System.out.println("IOException Error.");
        }
        
    }
    
}
