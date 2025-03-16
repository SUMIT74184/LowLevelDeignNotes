package LLDCarRentalZoom;

import LLDCarRentalZoom.Product.Vehicle;
import java.util.Date;

public class Reservation {
    int reservationId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date dateBookedFrom;
    Date dateBookedTo;
    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickupLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;
    Location location;

    public int createReserve(User user,Vehicle vehicle){
        reservationId=12121;
        this.user=user;
        this.vehicle=vehicle;
        reservationType=ReservationType.DAILY;
        reservationStatus= ReservationStatus.SCHEDULED;

        return reservationId;
    }


    //crud operations start from here
    public void add(Reservation reservation) {
    }
}
