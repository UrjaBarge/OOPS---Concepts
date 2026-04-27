package OOPS_4;
public class InheritanceDemo {
    public static void main(String[] args) {

        Car c1 = new Car("Toyota", 100,5);
        c1.displayInfo();

        Bike b1 = new Bike("Honda",80,true);
        b1.displayInfo();
    }
}