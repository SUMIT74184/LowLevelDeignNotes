package HandleNullObject;

import LLDCarRentalZoom.Product.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicles vehicles= vehicleFactory.getVehicleObject("Car");
        printVehicleDetails(vehicles);
    }
    private static void printVehicleDetails(Vehicles vehicles){
        if(vehicles!=null){ //now we can remove this
            System.out.println("seating capacity :"+vehicles.getSeatingCapacity());
            System.out.println("Fuel Tank capacity :"+vehicles.getTankCapacity());
        }
    }
}
