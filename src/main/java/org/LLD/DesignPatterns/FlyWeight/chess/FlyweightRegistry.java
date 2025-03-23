package org.LLD.DesignPatterns.FlyWeight.chess;

public interface FlyweightRegistry {

    void addFlyweight(UserIntrinsicState flyweight);

    UserIntrinsicState getFlyweight(String email);
}
