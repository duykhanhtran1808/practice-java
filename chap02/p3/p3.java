package chap02.p3;

import java.util.Scanner;
import java.util.Random;

class Player {
    String name;
    int score = 0;

    void guessRight() {
        score += 1;
    }
}

public class p3 {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        boolean gameRun = true;

        Player player01 = new Player();

        System.out.println("Enter command in order to play the game");
        System.out.println("First, enter your name:");
        String username = userinput.nextLine();
        player01.name = username;

        Random randomGen = new Random();
        System.out.println("Hello " + player01.name
                + "!, a number has been generated, type in a number to guess 0 1 2, or type quit in order to quit, type score in order to check score, play to play");
        while (gameRun) {
            int numberToGuess = (int) randomGen.nextInt(3);

            String useranswer = userinput.nextLine();
            if (useranswer.equals("quit")) {
                System.out.println("You will quit");
                break;
            } else if (useranswer.equals("score")) {
                System.out.println("Your score is " + player01.score);
                continue;
            } else if (useranswer.equals("play")) {
                System.out.println("Now guess");
                useranswer = userinput.nextLine();
                try {
                    int guessnum = Integer.parseInt(useranswer);
                    if (guessnum == numberToGuess) {
                        System.out.println("You are right!");
                        player01.guessRight();
                    } else {
                        System.out.println("You are wrong!");
                        continue;
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("What the fuck?");
                    continue;
                }
            }

            

        }

        userinput.close();
    }
}
