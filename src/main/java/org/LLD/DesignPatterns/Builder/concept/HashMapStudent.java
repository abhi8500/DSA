package org.LLD.DesignPatterns.Builder.concept;

import java.util.HashMap;

public class HashMapStudent {

    private int id;

    private String name;

    private int age;

    private long gradYear;

    private String batchName;

    public HashMapStudent(HashMap<String,Object> studentMap){

        if ((int)studentMap.get("age") <= 10){
            throw new IllegalArgumentException("Age must be greater than 10");
        }
        this.id = (int) studentMap.get("id");
        this.name = (String) studentMap.get("name");
        this.age = (int) studentMap.get("age");
        this.gradYear = (long) studentMap.get("gradYear");
        this.batchName = (String) studentMap.get("batchName");
    }
}
