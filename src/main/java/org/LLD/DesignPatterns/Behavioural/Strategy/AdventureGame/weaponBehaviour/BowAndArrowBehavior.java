package org.LLD.DesignPatterns.Behavioural.Strategy.AdventureGame.weaponBehaviour;

public class BowAndArrowBehavior implements WeaponBehavior{


    @Override
    public void useWeapon() {
        System.out.println("Shooting with bow and arrow");
    }
}
