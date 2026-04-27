// What is Polymorphism? many forms

// 1. Method Overloading (Compile-time) - 👉 Same method name
//                                        👉 Different parameters

// 2. Method Overriding (Run-time) - 👉 Same method name
//                                   👉 Same parameters

package OOPS_5;
public class PolymorphismDemo {
    public static void main(String[] args) {

        Car c1 = new Car("Toyota", 100,5);
        c1.displayInfo();

        Bike b1 = new Bike("Honda",80,true);
        b1.displayInfo();

        c1.start();
        b1.start();

        Vehicle v1 = new Vehicle("Nissan", 120);
        v1.start();

        // 👉 Reference = Vehicle 👉 Object = Car
        // ✔ Car IS-A Vehicle
        // ✔ So parent reference can hold child object (Method overriding (runtimepolymorphism))

        Vehicle v2 = new Car("BMW", 150, 4);
        v2.start();

        // Will print car is starting

        Vehicle v3 = new Bike("BMW", 150, true);
        v3.start();

        //Method Overloading (Compile-time polymorphism)
        b1.start("Hello");

    }
}