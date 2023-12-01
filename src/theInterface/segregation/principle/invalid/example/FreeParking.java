package theInterface.segregation.principle.invalid.example;

//this violates the interface segregation principle because the class have to implement all methods in the interface
public class FreeParking implements ParkingLot {
    @Override
    public void parkCar() {

    }

    @Override
    public void unParkCar() {

    }

    @Override
    public int getCapacity() {
        return 0;
    }

    @Override
    public double calculateFee(Car car) {
        return 0;
    }

    @Override
    public void doPayment(Car car) {

    }
}
