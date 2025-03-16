package HandleNullObject;

public class NullVehicle implements Vehicles {

    @Override
    public int getSeatingCapacity() {
        return 0;
    }

    @Override
    public int getTankCapacity() {
        return 0;
    }
}
