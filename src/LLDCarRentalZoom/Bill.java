package LLDCarRentalZoom;

public class Bill {
    Reservation reservation;
    double totalBillAmount;
    boolean isBillPaid;

    Bill(Reservation reservation){
        this.reservation=reservation;
        this.totalBillAmount=computeTotalBillAmount();
        isBillPaid=false;
    }
    public double computeTotalBillAmount(){
        return 234.12;
    }
}
