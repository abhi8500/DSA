package org.DSA.SinkAGame;

import java.util.ArrayList;

public class Startup {

    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> locs){
        locationCells = locs;
    }

    public void setName(String name1){
        name = name1;
    }

    public String checkYourself(String userInput){
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if(index >= 0){
            locationCells.remove(userInput);

            if(locationCells.isEmpty()){
                result = "kill";
                System.out.println("Ouch ! you sunk "+name+" : (" );
            }else {
                result = "hit";
            }

        }
        return result;
    }
}
