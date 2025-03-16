package LLDCarRentalZoom;

import LLDCarRentalZoom.Product.Vehicle;
import LLDCarRentalZoom.Product.VehicleType;

import java.util.*;

public class Store {
    int storeId;
    VehicleInventoryManagement inventoryManagement;
    Location storeLocation;
    List<Reservation> reservations=new ArrayList<>();


    public List<Vehicle>getVehicle(VehicleType vehicleType){
        return inventoryManagement.getVehicles();
    }

    public void setVehicles(List<Vehicle>vehicles){
        inventoryManagement=new VehicleInventoryManagement(vehicles);
    }

    public Reservation createReservation(Vehicle vehicle,User user){
        Reservation reservation=new Reservation();
        reservation.createReserve(user,vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationId){
        //take out the reservation from the list and call complete reservation method
        return true;
    }
    //update reservation

}
