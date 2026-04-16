// A constructor is a special method that runs automatically when an object is created.
// Constructor name = same as class name

// Constructor is used to give initial values to an object
// WITHOUT - Car c1 = new Car();
//           c1.model = "BMW";   // setting value later
// WITH -  Car c1 = new Car("BMW");  // value set at creation

package OOPS_2;

public class car {
    String brand;
    String color;
    int speed;

    public car(String brand,String color,int speed) {
        this.brand = brand;            // Also used brand = b (this. - represents current instance)
        this.color = color;
        this.speed = speed;
        System.out.println("Constructor called");
    }

    public void drive(){
        System.out.println(brand + " car is driving at a speed of " + speed);
    }

    //Function to return speed is created 
    public int getSpeed(){
        return speed;
    }

    //Function to set speed is created
    public int setSpeed(int speed){
        this.speed = speed;
        return speed;
    }
}