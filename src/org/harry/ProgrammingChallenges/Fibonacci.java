package org.harry.ProgrammingChallenges;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("# of places: ");

        int y = 0;
        int x = 1;

        for(int places = userInput.nextInt();places != 0;places = places - 1){
            int tempY = y;
            y = x + y;
            x = tempY;

            System.out.print(y + " ");
        }

    }
}
