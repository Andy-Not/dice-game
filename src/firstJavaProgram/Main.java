package firstJavaProgram;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 1;
        int playerNum = -1;
        menu();
        while (!quit){
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("pick a number from 1 - 6");
                    playerNum = scanner.nextInt();
                    if (playerNum <= 0){
                        break;
                    }
                    play(playerNum);
                    break;
                case 2:
                    quit = true;
                    break;
            }
        }

    }
    private static void menu() {
        System.out.println("\nPress: ");
        System.out.println("\n1 -> roll ");
        System.out.println("\n2 -> quit ");

    }
    private static void play(int playerPick){
        Random randomDiceNumber = new Random();
        int compPick = randomDiceNumber.nextInt(6)+1;
        if (playerPick == compPick){
            System.out.println("You Win! you picked: " + playerPick + " the computer picked: " + compPick);
        } else {
            System.out.println("You Lost! you picked: " + playerPick + " the computer picked: " + compPick);
        }

    }
}
