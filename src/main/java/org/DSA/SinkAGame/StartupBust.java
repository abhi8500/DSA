package org.DSA.SinkAGame;

import java.util.ArrayList;
import java.util.Arrays;

public class StartupBust {

    GameHelper helper = new GameHelper();
    ArrayList<Startup> startups = new ArrayList<Startup>();

    int numOfGuesses = 0;

    public void setupGame(){
        Startup one = new Startup();
        one.setName("poniez");
        Startup two = new Startup();
        two.setName("hacqi");
        Startup three = new Startup();
        three.setName("cabista");

        startups.addAll(Arrays.asList(one,two,three));
        System.out.println("Your goal is to sink three Startups");
        System.out.println("poniez , hacqi , cabista.");
        System.out.println("Try to sink them all in the fewest no of guesses");

        for(Startup startup : startups){
            ArrayList<String> newLoc = helper.placeStartup(3);
            startup.setLocationCells(newLoc);
        }
    }


    private void startPlaying(){
        while (!startups.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";
        for (Startup startup : startups) {
            result = startup.checkYourself(userGuess);

            if (result.equals("hit")) {
                break;
            }

            if(result.equals("kill")) {
                startups.remove(startup);
                break;
            }
        }

        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All Startups are dead! Your stock is now worthless");
        if (numOfGuesses <=18){
            System.out.println("It only took you "+numOfGuesses+" guesses .");
            System.out.println("You took out before options sank.");
        }else {
            System.out.println("Took you long enough. "+numOfGuesses+" guesses .");
            System.out.println("Fish are dancing with your options.");
        }
    }

    public static void main(String[] args) {
        StartupBust startupBust = new StartupBust();
        startupBust.setupGame();
        startupBust.startPlaying();
    }

}
