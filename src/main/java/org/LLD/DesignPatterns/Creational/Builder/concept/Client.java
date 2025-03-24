package org.LLD.DesignPatterns.Creational.Builder.concept;

import java.util.HashMap;

public class Client {

    public static void main(String[] args) {


        /**
         * <p>
         *  Creating a student object with passing through constructor
         *  The below approach to create a new object with parameters will fulfill the requirement of creating an object.
         *  But, There are many problems with below approach of object creation
         *  1.If the class have too many parameters with many combinations of creating object then the class will be bloating with multiple constructors.
         *  2.We are not able to restrict the order of parameters. that means client can send batch name in the name field.
         * <p/>
         */
        BasicStudent basicStudent = new BasicStudent(1, "Abhishek", 27, 2019, "May'2025");


        /**
         * <p>
         *  Creating a student object with default constructor and setter methods
         *  The below approach to create a new object with no arg constructor and setters will fulfill the requirement of
         *  creating an object with validations and order of parameters.
         *  But, There is 1 problem with below approach of object creation
         *  Here we are allowing the client to create an object before and then validating the object through setters. This ends up with unstable object creation.
         * <p/>
         */
        SetterStudent setterStudent = new SetterStudent();
        setterStudent.setId(1);
        setterStudent.setName("Abhishek");
        setterStudent.setAge(27);
        setterStudent.setGradYear(2019);
        setterStudent.setBatchName("May'2019");


        /**
         * <p>
         *  Creating a student object with  constructor by sending arguments of hashmap which contains fields as keys and values as value
         *  The below approach to create a new object with hashmap constructor  fulfill the requirement of
         *  creating an object with validations and order of parameters.
         *  But, There are many problem with below approach of object creation
         *  Here we are allowing the client to create an object with hashmap and hashmap can accept the values as object that means values are type safety.
         *  and Its difficult to remember all the fields names by the client
         * <p/>
         */
        HashMap<String, Object> studentMap = new HashMap<>();
        studentMap.put("id", "Abhi");
        studentMap.put("name", "Abhishek");
        studentMap.put("age", 27);
        studentMap.put("gradYear", 2019L);
        studentMap.put("batchName", "May'2019");

        HashMapStudent hashMapStudent = new HashMapStudent(studentMap);


        /**
         * <p>
         *  Creating a student object with  constructor by sending arguments of student builder.
         *  The below approach to create a new object with builder constructor  fulfill the requirement of
         *  creating an stable object with validations and order of parameters.
         *  But, There are some problem with below approach of object creation
         *  Here the client should aware of the builder object
         * <p/>
         */
        StudentBuilderNormal sb = new StudentBuilderNormal();
        sb.setId(1);
        sb.setName("Abhishek");
        sb.setAge(27);
        sb.setGradYear(2019);
        sb.setBatchName("May'2019");

        ExternalBuilderStudent externalBuilderStudent = new ExternalBuilderStudent(sb);


        /**
         * <p>
         *  Creating a student object with  constructor by sending arguments of student builder.
         *  The below approach to create a new object with builder constructor  fulfill the requirement of
         *  creating an stable object with validations and order of parameters.
         *  But, There are some problem with below approach of object creation
         *  Here the client should be aware of the builder object which is returning from getBuilder
         * <p/>
         */
        StudentBuilderNormal builderFromClass = ExposingBuilderStudent.getBuilder();
        builderFromClass.setId(1);
        builderFromClass.setName("Abhishek");
        builderFromClass.setAge(27);
        builderFromClass.setGradYear(2019);
        builderFromClass.setBatchName("May'2019");

        ExposingBuilderStudent exposingBuilderStudent = new ExposingBuilderStudent(builderFromClass);


        /**
         * <p>
         *  Creating a student object with  constructor by sending arguments of student builder.
         *  The below approach to create a new object with builder constructor  fulfill the requirement of
         *  creating an stable object with validations and order of parameters.
         *  But, There are some problem with below approach of object creation
         *  Here still we have problem of client should be aware of the builder object which is returning from getBuilder
         *  but some optimized than before
         * <p/>
         */

        StudentBuilderOutside studentBuilderOutside = OptimizedBuilderStudent.getBuilder().setId(1)
                .setName("Abhishek").setAge(27).setGradYear(2019).setBatchName("May'2019");
        OptimizedBuilderStudent optimizedBuilderStudent = new OptimizedBuilderStudent(studentBuilderOutside);


        /**
         * <p>
         *  Creating a student object with  constructor by sending arguments of student builder.
         *  The below approach to create a new object with builder constructor  fulfill the requirement of
         *  creating a stable object with validations and order of parameters and problem of hiding builder to client and return type
         *  But, There are creating multiple separate classes for builders
         *  Here
         *  but some optimized than before
         * <p/>
         */

        BuildingStudent buildingStudent = BuildingStudent.getBuilder().setId(1)
                .setName("Abhishek").setAge(9).setGradYear(2019).setBatchName("May'2019").build();

        /**
         * <p>
         *  Creating a student object with  constructor by sending arguments of student builder.
         *  The below approach to create a new object with builder constructor  fulfill the requirement of
         *  creating a stable object with validations and order of parameters and problem of hiding builder to client and return type
         *  But, There are creating multiple separate classes for builders
         *  Here
         *  but some optimized than before
         * <p/>
         */


        FinalStudent finalStudent = FinalStudent.getBuilder().setId(1)
                .setName("Abhishek").setAge(9).setGradYear(2019).setBatchName("May'2019").build();

    }
}
