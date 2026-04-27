package OOPS_4;

public class Bike extends Vehicle{
    private boolean hasCarrier;
    public Bike(String brand, int speed, boolean hasCarrier) {
        super(brand, speed); // Call the constructor of the parent class (Vehicle)
        this.hasCarrier = hasCarrier;
    }

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo method of the parent class (Vehicle)
        System.out.println("Brand: " + getBrand() + ", Speed: " + getSpeed() + " km/hr" + ", Has Carrier: " + hasCarrier); // Called overriding but in child class as speed and brand are private in parent classwe need to use get 
    }
}
