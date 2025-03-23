package org.LLD.DesignPatterns.FlyWeight.chess;

import java.util.HashMap;
import java.util.Map;

public class FlyweightRegistryImpl implements FlyweightRegistry{

    Map<String,UserIntrinsicState> usersMap = new HashMap<>();

    @Override
    public void addFlyweight(UserIntrinsicState flyweight) {
        usersMap.put(flyweight.getEmail(),flyweight);
    }

    @Override
    public UserIntrinsicState getFlyweight(String email) {
        return usersMap.get(email);
    }
}
