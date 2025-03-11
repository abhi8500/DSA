package org.LLD.DesignPatterns.Builder.concept;

public class StudentBuilderOutside {

    int id;

    String name;

    int age;

    long gradYear;

    String batchName;

    public StudentBuilderOutside setId(int id) {
        this.id = id;
        return this;
    }

    public StudentBuilderOutside setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilderOutside setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilderOutside setGradYear(long gradYear) {
        this.gradYear = gradYear;
        return this;
    }

    public StudentBuilderOutside setBatchName(String batchName) {
        this.batchName = batchName;
        return this;
    }

    public BuildingStudent build(){
        return new BuildingStudent(this);
    }
}
