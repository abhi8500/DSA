package org.LLD.miscellaneous.comparable;

public class CarWithComparable implements Comparable<CarWithComparable>{

    private int speed;
    private int power;

    public CarWithComparable(int speed,int power){
        this.speed = speed;
        this.power = power;
    }

    @Override
    public String toString(){
        return "[S=" + this.speed + ", P=" + this.power + "]";
    }

    @Override
    public int compareTo(CarWithComparable other){
        return this.speed - other.speed;
    }


}
