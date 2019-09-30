package org.harry;

import java.io.*;

public class FileWriting {
    public static void main(String[] args){
     
        try{
            FileWriter file = new FileWriter("resources/writing.txt");
            BufferedWriter buff = new BufferedWriter(file);
            
            buff.write("This is a text file.");
            buff.write("Here is another sentence.");
            
            buff.close();   
        }
        catch(IOException e){   
            System.out.println("The code did an IOException");
        }
        
    }
}