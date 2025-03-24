package org.LLD.DesignPatterns.Behavioural.Strategy.AdventureGame;

import org.LLD.DesignPatterns.Behavioural.Strategy.AdventureGame.weaponBehaviour.KnifeBehavior;

public class Client {

    public static void main(String[] args) {

        Character king = new King();
        king.setWeaponBehavior(new KnifeBehavior());
        king.useWeapon();
        king.fight();
    }
}
