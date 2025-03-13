package org.LLD.DesignPatterns.Strategy.AdventureGame.weaponBehaviour;

public class SwordBehavior implements WeaponBehavior{


    @Override
    public void useWeapon() {
        System.out.println("swinging a sword");
    }
}
