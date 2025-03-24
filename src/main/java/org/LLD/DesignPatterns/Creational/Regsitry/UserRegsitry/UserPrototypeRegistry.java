package org.LLD.DesignPatterns.Creational.Regsitry.UserRegsitry;

import org.LLD.DesignPatterns.Creational.Prototype.User.User;
import org.LLD.DesignPatterns.Creational.Prototype.User.UserType;

public interface UserPrototypeRegistry {

    void addPrototype(User user);

    User getPrototype(UserType type);

    User clone(UserType type);
}
