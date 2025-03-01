package org.LLD.DesignPatterns.StrategyPattern.AdventureGame.weaponBehaviour;

public class SwordBehavior implements WeaponBehavior{


    @Override
    public void useWeapon() {
        System.out.println("swinging a sword");
    }
}
