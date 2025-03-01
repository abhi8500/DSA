package org.LLD.DesignPatterns.StrategyPattern.AdventureGame;

import org.LLD.DesignPatterns.StrategyPattern.AdventureGame.weaponBehaviour.WeaponBehavior;

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
