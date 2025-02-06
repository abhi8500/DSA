package org.LLD.InterfaceAndAbstract.VehicleCS;

public class Car implements Rentable {

    /// Data Members
    public String carModel;

    public boolean isRented;

    /// Constructor
    public Car(String carModel){
        this.carModel = carModel;
    }

    /// Behavior Implementations
    @Override
    public void rent() {
        if (!isRented) {
            isRented = true;
            System.out.println(this.carModel+" is now rented");
        }
    }

    @Override
    public void returnItem() {
        if (isRented) {
            isRented = false;
            System.out.println(this.carModel+" is now returned");
        }
    }
}
