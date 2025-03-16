package LLDCarRentalZoom.Product;
import java.util.Date;

public class Vehicle {
    int VehicleId;
    int vehicleNumber;
    String companyName;
    String modelName;
    int kmDriven;
    Date manufacturtingDate;
    int average;
    int cc;
    int dailyRentalCost;
    int hourlyRentalCost;
    int noOfSeat;
    Status status;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    VehicleType vehicleType;


    public void setVehicleId(int vehicleId) {
        VehicleId = vehicleId;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setKmDriven(int kmDriven) {
        this.kmDriven = kmDriven;
    }

    public void setManufacturtingDate(Date manufactutingDate) {
        this.manufacturtingDate = manufactutingDate;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setDailyRentalCost(int dailyRentalCost) {
        this.dailyRentalCost = dailyRentalCost;
    }

    public void setHourlyRentalCost(int hourlyRentalCost) {
        this.hourlyRentalCost = hourlyRentalCost;
    }

    public void setNoOfSeat(int noOfSeat) {
        this.noOfSeat = noOfSeat;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getVehicleId() {
        return VehicleId;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getModelName() {
        return modelName;
    }

    public int getKmDriven() {
        return kmDriven;
    }

    public Date getManufactutingDate() {
        return manufacturtingDate;
    }

    public int getAverage() {
        return average;
    }

    public int getCc() {
        return cc;
    }

    public int getDailyRentalCost() {
        return dailyRentalCost;
    }

    public int getHourlyRentalCost() {
        return hourlyRentalCost;
    }

    public int getNoOfSeat() {
        return noOfSeat;
    }

    public Status getStatus() {
        return status;
    }


}
