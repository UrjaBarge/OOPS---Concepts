package OOPS_2;

public class constructordemo {
    
    public constructordemo() {

        //OBJECT 1 CREATION

        car car1 = new car( "Toyota","Red",-100);
        //object car1 function
        car1.drive();

        //OBJECT 2 CREATION
        car car2 = new car( "Tesla","Blue",300);
        //object car1 function
        car2.drive();

        //Get the speed of car2 with get keywords
        System.out.println(car2.getSpeed());

        //Set the speed of car2 with set keywords 
        System.out.println(car2.setSpeed(400));

        // If speed is private then i cant access it directly .speed but with get and set its possible
    }

    public static void main(String[] args) {
        new constructordemo();
    }
}
