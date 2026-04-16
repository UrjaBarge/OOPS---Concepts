// What is a Class? - A class is only a design / plan / structure that tells:
//                  - What things (data) an object will have
//                  - what things (functions) an object can do

// An object is a real thing made from a class - It is where actual data is stored.

// Example = 🔹 Class = Student || It defines: Name, Roll number, Age (But no real student yet.)

//🔹 Object = Real Student || Urja, Roll No 21 || Riya, Roll No 32

// 👉 Stack stores address
// 👉 Heap stores real data

// new → Creates Object in heap (without it object is not created)

package OOPS_1;

public class car {
    String brand; // brand is an instance of string class
    String color;
    int speed;

    public void drive(){
        System.out.println(brand + " car is driving at a speed of " + speed);
    }
}

// class abc{ - // If i add public then i need to make file name abc.java 
//     public static void main(String[] args){
//         car car1 = new car(); - // car1 is an obj of class car
//         //object car1 propertise
//         car1.brand = "Toyota"; // brand is a instance varable 
//         car1.speed = 100;
//         car1.color="Red";
//         //object car1 function
//         car1.drive();}
// }

//Scanner, date, Math  is an inbuilt class (code by someone else earlier and we can use by importing it )
//Primitive data types are not objects but they can be wrapped in wrapper classes (int,double,char)