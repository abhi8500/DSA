package org.LLD.DesignPatterns.Behavioural.Strategy.AdventureGame;

import org.LLD.DesignPatterns.Behavioural.Strategy.AdventureGame.weaponBehaviour.WeaponBehavior;

public abstract class Character {

    WeaponBehavior weaponBehavior;

    void setWeaponBehavior(WeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }

    void useWeapon(){
        weaponBehavior.useWeapon();
    }
    public abstract void fight();

}
