package org.LLD.DesignPatterns.Builder.concept;

public class StudentBuilderNormal {

    int id;

    String name;

    int age;

    long gradYear;

    String batchName;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGradYear(long gradYear) {
        this.gradYear = gradYear;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }
}
