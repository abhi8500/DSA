package org.LLD.DesignPatterns.Creational.Builder.concept;

public class FinalStudent {

    private int id;

    private String name;

    private int age;

    private long gradYear;

    private String batchName;

    private FinalStudent(StudentBuilder sb){
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
    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    public static class StudentBuilder {

        int id;

        String name;

        int age;

        long gradYear;

        String batchName;


        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setGradYear(long gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public StudentBuilder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }

        public FinalStudent build(){
            return new FinalStudent(this);
        }
    }

}
