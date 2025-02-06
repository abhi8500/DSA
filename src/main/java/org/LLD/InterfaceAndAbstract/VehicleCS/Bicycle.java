package org.LLD.InterfaceAndAbstract.VehicleCS;

public class Bicycle implements Rentable{

    /// Data Members
    public String bicycleModel;
    public boolean isRented;

    /// Constructor
    public Bicycle(String bicycleModel){
        this.bicycleModel = bicycleModel;
    }

    /// Behaviour Implementations
    @Override
    public void rent() {
        if (!isRented) {
            isRented = true;
            System.out.println(this.bicycleModel+" is now rented");
        }
    }

    @Override
    public void returnItem() {
        if (isRented) {
            isRented = false;
            System.out.println(this.bicycleModel+" is now returned");
        }
    }
}
