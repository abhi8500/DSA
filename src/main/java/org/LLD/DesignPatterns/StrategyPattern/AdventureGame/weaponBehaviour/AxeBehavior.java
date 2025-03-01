package org.LLD.DesignPatterns.StrategyPattern.AdventureGame.weaponBehaviour;

public class AxeBehavior implements WeaponBehavior{


    @Override
    public void useWeapon() {
        System.out.println("chopping with an axe");
    }
}
