package org.LLD.DesignPatterns.Regsitry.UserRegsitry;

import org.LLD.DesignPatterns.Prototype.User.User;
import org.LLD.DesignPatterns.Prototype.User.UserType;

public interface UserPrototypeRegistry {

    void addPrototype(User user);

    User getPrototype(UserType type);

    User clone(UserType type);
}
