package OOPS_3;

// I get the control of data which data to show and which not too
// If want to show only car speed and not want to show color and brand then i can do it with it

//If public then anyone can access it but if private then only the class can acces it and if protected then same class and child class
class EncapsulationDemo {
    private String brand;
    private String color;
    private int speed;

    public EncapsulationDemo(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        setSpeed(speed); // Using setter able to set speed and above fixed 
    }

    public void drive() {
        System.out.println(brand + " car is driving at a speed of " + speed);
    }

    public int getSpeed() {
        return speed;
    }

    // If i want that speed should be not set by anyone and chnage it so i will remove the function of setspeed
    // so value of speed will be set only when we create object and after that noone caann
    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Speed cannot be negative!");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
        public static void main(String[] args) {
        EncapsulationDemo car = new EncapsulationDemo("Toyota", "Red",-100);
        car.drive(); // Called the function 
    }
}

