package OOPS_1;

// ClassessObjectdemo is sub package of OOPS_1 PACKAGE 

public class ClasessObjectdemo {
    
    public ClasessObjectdemo() {

        //OBJECT 1 CREATION

        car car1 = new car();
        //object car1 propertise
        car1.brand = "Toyota";
        car1.speed = -100;
        car1.color="Red";
        //object car1 function
        car1.drive();

        //OBJECT 2 CREATION
        car car2 = new car();
        //object car1 propertise
        car2.brand = "Tesla";
        car2.speed = 300;
        car2.color="Blue";
        //object car1 function
        car2.drive();
    }

    public static void main(String[] args) {
        new ClasessObjectdemo();
    }
}
