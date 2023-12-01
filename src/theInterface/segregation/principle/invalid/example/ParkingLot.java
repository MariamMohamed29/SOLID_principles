package theInterface.segregation.principle.invalid.example;

public interface ParkingLot {
    void parkCar();
    void unParkCar();
    int getCapacity();
    double calculateFee(Car car);
    void doPayment(Car car);
}
