package org.LLD.DesignPatterns.Structural.FlyWeight.chess;

import org.LLD.DesignPatterns.Structural.FlyWeight.IntrinsicState;

@IntrinsicState
public class UserIntrinsicState {

    private String name;
    private int age;
    private String gender;
    private String email;
    private String phoneNumber;
    private Byte[] photo;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Byte[] getPhoto() {
        return photo;
    }
}
