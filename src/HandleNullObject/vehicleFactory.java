package HandleNullObject;

public class vehicleFactory {
    static Vehicles getVehicleObject(String TypeOfVehicle){
        if("Car".equals(TypeOfVehicle)){
            return new Car();
        }
        return new NullVehicle();
//        return null;
    }
}
