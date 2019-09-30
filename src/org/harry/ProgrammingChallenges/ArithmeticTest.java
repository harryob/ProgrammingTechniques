package org.harry.ProgrammingChallenges;

import java.util.Random;
import java.util.Scanner;

public class ArithmeticTest {
    public static void main(String[] args){
        Scanner inputName = new Scanner(System.in);
        System.out.println("What's your name?");
        String userName = inputName.nextLine();

        int score = 0;

        for(int i = 10;i!=0;i=i-1){
            if(askQuestion()){
                System.out.println("Congratulations! You were correct.");
                score = score + 1;
                System.out.println("Your score is " + score);
            }
            else System.out.println("That was incorrect.");
        }

        System.out.println("Final score is " + score);

    }

    private static boolean askQuestion() {
        Random rand = new Random();

        int num1 = rand.nextInt(20);
        int num2 = rand.nextInt(20);

        int whichQuestion = rand.nextInt(3);
        System.out.println("Solve the following question:");

        if(whichQuestion == 0){
            return doMultiplication(num1, num2);
        }
        if(whichQuestion == 1){
            return doDivision();
        }
        if(whichQuestion == 2){
            return doAddition(num1, num2);
        }
        if(whichQuestion == 3){
            return doSubtraction(num1, num2);
        }
        else{
            System.out.println("An error has occurred.");
            return false;
        }

    }

    private static boolean doSubtraction(int num1, int num2) {
        Scanner inputAnswer = new Scanner(System.in);

        int answer = num1 - num2;
        System.out.println(num1 +" - "+ num2);

        int givenAnswer = inputAnswer.nextInt();
        return givenAnswer == answer;

    }

    private static boolean doAddition(int num1, int num2) {
        Scanner inputAnswer = new Scanner(System.in);

        int answer = num1 + num2;
        System.out.println(num1 + " + " + num2);

        int givenAnswer = inputAnswer.nextInt();
        return givenAnswer == answer;

    }

    private static boolean doDivision() {
        Scanner inputAnswer = new Scanner(System.in);
        Random rand = new Random();

        int num1 = rand.nextInt(6) + 1;
        int num2 = rand.nextInt(6) + 1;

        int answer = num1 / num2;
        System.out.println(num1 + " / " + num2);

        float givenAnswer = inputAnswer.nextFloat();
        return givenAnswer == answer;

    }

    private static boolean doMultiplication(int num1, int num2) {
        Scanner inputAnswer = new Scanner(System.in);

        int answer = num1 * num2;
        System.out.println(num1 + " * " + num2);

        int givenAnswer = inputAnswer.nextInt();
        return givenAnswer == answer;

    }

}
