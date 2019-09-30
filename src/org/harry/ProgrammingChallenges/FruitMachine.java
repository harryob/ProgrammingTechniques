package org.harry.ProgrammingChallenges;

import java.util.Scanner;
import java.util.Random;

public class FruitMachine {
    private static long playerCurrent = 100;

    public static void main(String[] args){

        Scanner playerInput = new Scanner(System.in);
        System.out.println("Do you want to play the game? Y/N");

        String playGame = playerInput.nextLine();
        if(playGame.equals("Y")) initializeGame();
        else startGame();

    }

    private static void initializeGame() {
        System.out.println("Balance: " + playerCurrent);
        Scanner playerStart = new Scanner(System.in);
        System.out.println("Do you want to roll? Y/N");
        System.out.println("Each roll costs 20p.");

        String start = playerStart.nextLine();
        if(start.equals("Y")) {
            startGame();
            playerCurrent = playerCurrent - 20;
        } else System.out.println("Bye!");
    }

    private static void startGame(){
        Random rand = new Random();

        int randomInteger1 = rand.nextInt(5);
        int randomInteger2 = rand.nextInt(5);
        int randomInteger3 = rand.nextInt(5);

        if(randomInteger1 == randomInteger2) playerCurrent = playerCurrent + 20;
        if(randomInteger1 == randomInteger3) playerCurrent = playerCurrent + 20;
        if(randomInteger2 == randomInteger3) playerCurrent = playerCurrent + 20;

        if(randomInteger1 == randomInteger2 && randomInteger2 == randomInteger3) playerCurrent = playerCurrent + 40;
        if(randomInteger1 == 1 && randomInteger2 == 1 && randomInteger3 == 1) playerCurrent = playerCurrent + 500;
        if (randomInteger1 == 2 && randomInteger3 == 2) {
            playerCurrent = playerCurrent - 20;
        } else if (randomInteger1 == 2 && randomInteger2 == 2) {
            playerCurrent = playerCurrent - 20;
        } else if (randomInteger3 == 2 && randomInteger2 == 2) {
            playerCurrent = playerCurrent - 20;
        }
        if(randomInteger1 == 6 && randomInteger2 == 6 && randomInteger3 == 6) playerCurrent = 0;

        System.out.println("You rolled:");
        System.out.print(returnCharacter(randomInteger1));
        System.out.print(returnCharacter(randomInteger2));
        System.out.print(returnCharacter(randomInteger3));

        initializeGame();
     }
     private static String returnCharacter(int character){
                if (character == 0) {
                    return ("🍒");
                }
                if (character == 1) {
                    return ("🔔");
                }
                if (character == 2) {
                    return ("🍋");
                }
                if (character == 3) {
                    return ("🍊");
                }
                if (character == 4) {
                    return ("⭐");
                }
                if (character == 6) {
                    return ("💀");
                }
                else{
                    return("N/A");
                }
            }
}
