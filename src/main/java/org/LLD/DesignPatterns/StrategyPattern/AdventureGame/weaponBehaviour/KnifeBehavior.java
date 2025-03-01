package org.LLD.DesignPatterns.StrategyPattern.AdventureGame.weaponBehaviour;

public class KnifeBehavior implements WeaponBehavior{


    @Override
    public void useWeapon() {
        System.out.println("cutting with a knife");
    }
}
