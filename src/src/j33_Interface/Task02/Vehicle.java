package src.j33_Interface.Task02;

public class Vehicle {

    String model;
    double motor;

    public Vehicle(String model, double motor) {
        this.model = model;
        this.motor = motor;
    }

    public Vehicle() {
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                " model='" + model +
                ", motor=" + motor;
    }
}
