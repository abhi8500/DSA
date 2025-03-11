package org.LLD.DesignPatterns.Builder.concept;

public class ExposingBuilderStudent {

    private int id;

    private String name;

    private int age;

    private long gradYear;

    private String batchName;

    public ExposingBuilderStudent(StudentBuilderNormal sb){
        if (sb.age < 10){
            throw new IllegalArgumentException("Age must be greater than 10");
        }
        this.id = sb.id;
        this.name = sb.name;
        this.age = sb.age;
        this.gradYear = sb.gradYear;
        this.batchName = sb.batchName;
    }


    ///  As we want builder before creating object make getBuilder as static
    public static StudentBuilderNormal getBuilder(){
        return new StudentBuilderNormal();
    }
}
