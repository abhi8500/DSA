package org.LLD.DesignPatterns.Behavioural.Strategy.AdventureGame.weaponBehaviour;

public class SwordBehavior implements WeaponBehavior{


    @Override
    public void useWeapon() {
        System.out.println("swinging a sword");
    }
}
