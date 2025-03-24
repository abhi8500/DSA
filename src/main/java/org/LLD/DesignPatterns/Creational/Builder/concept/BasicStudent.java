package org.LLD.DesignPatterns.Creational.Builder.concept;

public class BasicStudent {

    private int id;

    private String name;

    private int age;

    private long gradYear;

    private String batchName;

    public BasicStudent(int id,String name,int age,long gradYear,String batchName){

        if (age < 10){
            throw new IllegalArgumentException("Age must be greater than 10");
        }
        this.id = id;
        this.name = name;
        this.age = age;
        this.gradYear = gradYear;
        this.batchName = batchName;
    }
}
