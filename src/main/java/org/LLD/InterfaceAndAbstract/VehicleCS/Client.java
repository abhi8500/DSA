package org.LLD.InterfaceAndAbstract.VehicleCS;

public class Client {

    public static void main(String[] args){

        Rentable car = new Car("Toyoto model");
        Rentable cycle = new Bicycle(" Cycle");

        car.rent();
        cycle.rent();

        car.returnItem();
        cycle.returnItem();
    }
}
