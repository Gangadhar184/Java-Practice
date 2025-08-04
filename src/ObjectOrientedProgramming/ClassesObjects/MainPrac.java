package ObjectOrientedProgramming.ClassesObjects;

/**
 * Define class with exact form and nature.
 * WEhn we create a class we are creating new datatype
 * The data or variables defined with class are called instance variables
 * instance of the class( that is each object of class) contains its own copy of these variables, so data for one obj is separate and unique from data for another
 *
 * The new operator dynamically allocates memory at run time for an object and returns a reference to it
 * It is address in memory of the object allocated by new. THis reference is stored in variable
 *
 */

public class MainPrac {
    String brand;
    String model;
    int year;
    double price;
}
class CarDemo{
    public static void main(String[] args) {


        MainPrac c; // declares reference to obj
        c = new MainPrac(); // and allocate a MainPrac object

        // c has a reference to an object of type MainPrac. Initial value is null -> doesnt point to an actual obj
        // c holds the memory address of the actual obj MainPrac object
        c.brand = "benz";
        c.model = "a class";
        c.year = 2018;
        c.price = 123232.12312;

        System.out.println(c.brand + " " + c.model + " " + c.year + " " + c.price);

    }
}

/**
 * A class creates a new datatype that can be used to create objects
 * A class creates a logical framework that defines the relationship between its members.
 * When we create object of a class we are creating an instance of that class
 * OBject occupies space in memory
 */
