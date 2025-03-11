package org.LLD.DesignPatterns.Builder.concept;

public class SetterStudent {

    private int id;

    private String name;

    private int age;

    private long gradYear;

    private String batchName;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {
        if (age < 10){
            throw new IllegalArgumentException("Age must be greater than 10");
        }
        this.age = age;
    }

    public void setGradYear(long gradYear) {
        this.gradYear = gradYear;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }
}
