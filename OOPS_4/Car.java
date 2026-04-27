package OOPS_4;

import OOPS_4.Car;
public class Car extends Vehicle {

    private int doors;

    public Car(String brand, int speed, int doors) { // Car class passes brand and speed to vehicle class using super keyword
        this.doors=doors;                                  // Parent class constructure is called by child class constructor using super keyword
        super(brand, speed);
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo method of the parent class (Vehicle)
        System.out.println("Brand: " + getBrand() + ", Speed: " + getSpeed() + " km/hr" + ", Doors: " + doors); // Called overriding but in child class as speed and brand are private in parent classwe need to use get 
    }
}
