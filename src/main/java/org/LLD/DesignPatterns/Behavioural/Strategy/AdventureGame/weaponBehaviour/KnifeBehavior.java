package org.LLD.DesignPatterns.Behavioural.Strategy.AdventureGame.weaponBehaviour;

public class KnifeBehavior implements WeaponBehavior{


    @Override
    public void useWeapon() {
        System.out.println("cutting with a knife");
    }
}
