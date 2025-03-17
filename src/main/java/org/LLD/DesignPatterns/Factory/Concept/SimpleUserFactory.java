package org.LLD.DesignPatterns.Factory.Concept;

public class SimpleUserFactory {

    public static User createUser(String userType) {
        return switch (userType) {
            case "Student" -> new Student("John", "Doe");
            case "Teacher" -> new Teacher("John", "Doe");
            case "Principle" -> new Principle("John", "Doe");
            default -> throw new IllegalArgumentException("User type is not correct");
        };
    }
}
