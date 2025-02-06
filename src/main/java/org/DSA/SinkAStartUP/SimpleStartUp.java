package org.DSA.SinkAStartUP;

public class SimpleStartUp {

    int[] locationCells;
    int numOfHits = 0;

    public String checkYourself(int userGuess){
        String result = "miss";
        for(int cell : locationCells){
            if(cell == userGuess){
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if(numOfHits == locationCells.length) {
            result = "kill";
        }

        System.out.println(result);

        return result;
    }

    public void setLocationCells(int[] locs){
        locationCells = locs;
    }
}
