package OOPS_5;

public class Vehicle {
    // If we dont call super keyword we cant access it in clild class 
    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        setSpeed(speed);
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Speed cannot be negative!");
        }
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/hr");
    }

    public void start() {
        System.out.println("Vehicle is starting...");
    }
}
