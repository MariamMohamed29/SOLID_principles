package theInterface.segregation.principle.valid.example;

import theInterface.segregation.principle.invalid.example.Car;

//we create this interface and make it extends from Parking interface,so it has it's own methods and also can override the parking interface methods
public interface PaidParking extends Parking {
    @Override
    void parkCar();

    @Override
    void unParkCar();

    double calculateFee(Car car);

    void doPayment(Car car);
}
