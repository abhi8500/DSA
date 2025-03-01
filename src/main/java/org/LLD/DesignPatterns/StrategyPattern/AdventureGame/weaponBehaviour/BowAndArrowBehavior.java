package org.LLD.DesignPatterns.StrategyPattern.AdventureGame.weaponBehaviour;

public class BowAndArrowBehavior implements WeaponBehavior{


    @Override
    public void useWeapon() {
        System.out.println("Shooting with bow and arrow");
    }
}
