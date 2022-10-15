package chap05.p1;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class SimpleStartupGame {
    // GameHelper helper = new GameHelp();
    ArrayList<SimpleStartup> startups;
    int numOfGuesses = 0;
    public static void main(String[] args) {
        // //Generate SimpleStartup location
        // SimpleStartup dot = new SimpleStartup();
        // Random random = new Random();
        // int startLoc = random.nextInt(4);
        // int[] locations = {startLoc,startLoc+1,startLoc+2};
        // dot.setLocationCells(locations);

        
        // Scanner userInput = new Scanner(System.in);
        // int userGuess;
        // String result;
        // boolean gameOver = false;

        // while(!gameOver) {
        //     System.out.println("Playing game: enter your guess from 0 - 7");
        //     userGuess = Integer.parseInt(userInput.nextLine());
        //     numOfGuesses++;
        //     result = dot.checkYourself(userGuess);

        //     if(result.equals("miss")) {
        //         System.out.println("You have missed, your total guess: " + numOfGuesses);
        //     } else if(result.equals("hit")) {
        //         System.out.println("You hit! Your total guess: " + numOfGuesses);
        //     } else {
        //         System.out.println("You have sunk the ship! Your total guess: " + numOfGuesses);
        //         gameOver = true;
        //     }
        // }
        // userInput.close();
        SimpleStartupGame game = new SimpleStartupGame();
        game.setUpGame();
        game.startPlaying();
    }

    private void setUpGame() {
        SimpleStartup startup1 = new SimpleStartup();
        startup1.setName("Mobicast");
        SimpleStartup startup2 = new SimpleStartup();
        startup2.setName("Mobiluck");
        SimpleStartup startup3 = new SimpleStartup();
        startup3.setName("Vietbaipro");
        startups.add(startup1);
        startups.add(startup2);
        startups.add(startup3);

        System.out.println("You have to sink 3 startups");
        System.out.println("Mobicast, Mobiluck, Vietbaipro");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for(SimpleStartup startup: startups) {
            // ArrayList<String> newLoc = helper.placeStartup(3);
            // startup.setLocationCells(newLoc);
        }
    }

    private void startPlaying() {
        while(!startups.isEmpty()) {
            // String userGuess = helper.getUserInput("Enter a guess");
            // checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";

        for(SimpleStartup startupToTest: startups) {
            result = startupToTest.checkYourself(userGuess);

            if(result.equals("hit")) {
                break;
            }
            if(result.equals("kill")) {
                startups.remove(startupToTest);
                break;
            }
        }

        System.out.println(result);
    }   

    private void finishGame() {
        System.out.println("You won!");
        System.out.println("Number of guesses took to win: " + numOfGuesses);
    }
}

class SimpleStartup {
    // private int[] locationCells;
    private ArrayList<String> locationCells;
    private String startupName;
    // private int numOfHits;

    public void setName(String nameToSet) {
        startupName = nameToSet;
    }

    public String getName() {
        return startupName;
    }

    public String checkYourself(String guess) {
        String result = "miss";
        int index = locationCells.indexOf(guess);

        if(index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        // for(int cell: locationCells) {
        //     if(guess == cell) {
        //         result = "hit";
        //         numOfHits++;
        //         break;
        //     }
        // }

        // if(numOfHits == locationCells.length) {
        //     result = "kill";
        // }
        return result;
    }

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }
}