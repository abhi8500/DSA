package org.LLD.DesignPatterns.Behavioural.Strategy.AdventureGame.weaponBehaviour;

public class AxeBehavior implements WeaponBehavior{


    @Override
    public void useWeapon() {
        System.out.println("chopping with an axe");
    }
}
