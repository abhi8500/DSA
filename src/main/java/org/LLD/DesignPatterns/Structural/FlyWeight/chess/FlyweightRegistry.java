package org.LLD.DesignPatterns.Structural.FlyWeight.chess;

public interface FlyweightRegistry {

    void addFlyweight(UserIntrinsicState flyweight);

    UserIntrinsicState getFlyweight(String email);
}
