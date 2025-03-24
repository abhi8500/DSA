package org.LLD.DesignPatterns.Creational.Regsitry.UserRegsitry;

import org.LLD.DesignPatterns.Creational.Prototype.User.User;
import org.LLD.DesignPatterns.Creational.Prototype.User.UserType;

import java.util.HashMap;
import java.util.Map;

public class UserPrototypeRegistryImpl implements UserPrototypeRegistry{

    private Map<UserType,User> usersMap = new HashMap<>();

    @Override
    public void addPrototype(User user) {
        usersMap.put(user.getType(),user);
    }

    @Override
    public User getPrototype(UserType type) {
        return usersMap.get(type);
    }

    @Override
    public User clone(UserType type) {
        return usersMap.get(type).cloneObject();
    }
}
