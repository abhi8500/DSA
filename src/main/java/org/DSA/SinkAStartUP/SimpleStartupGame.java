package org.DSA.SinkAStartUP;

import java.util.Random;

public class SimpleStartupGame {

    public static void main(String[] args){
        int numOfGuesses = 0;
        GameHelper gameHelper = new GameHelper();
        SimpleStartUp simpleStartUp = new SimpleStartUp();
        Random random = new Random();
        int randomNum = random.nextInt(5);
        int[] locations = {randomNum,randomNum+1,randomNum+2};
        simpleStartUp.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive){
            int guess = gameHelper.getUserInput("Enter a number");
            String result  = simpleStartUp.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")){
                isAlive =  false;
                System.out.println("You took "+numOfGuesses + " Guesses. ");
            }
        }
    }
}
