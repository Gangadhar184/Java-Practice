package ObjectOrientedProgramming.Constructors;

/**
 * Constructor: It is a special method in java that gets automatically called
 *              when you create an object. It initializes the object state and setup everything the object needs to
 *              function properly
 *
 *  Characteristics: Same name as class , No return type(not even void) ,
 *                   called automatically when using new keyword,
 *                   Initialize the object state
 *
 *   Constructor solves 3 fundamental problems
 *   1. Initialization: It ensures objects start with valid state
 *   2. Convenience: Create fully formed object in one step
 *   3. Validation: Enforce business rules during object creation

 *   Types: Default, Parameterized, Constructor Overloading

 *   Use constructor chaining (this()) to avoid code duplication

 *   Create objects that can't be accidentally modified
 */

public class Practice {
    private final String name;
    private final int age;
    private String course;

    //default Constructor
    public Practice() {
        this.name = "Unknown";
        this.age = 0;
    }

    // parameterized
    public Practice(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // overloading
    public Practice(String name, int age, String course){
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String toString() {
        return "Practice{name='" + name + "', age=" + age + ", course='" + course + "'}";
    }

    public static void main(String[] args) {
        Practice p = new Practice();
        Practice p1 = new Practice("slayer", 10);
        Practice p2 = new Practice("luffy", 19, "pirate");

        System.out.println(p);
        System.out.println(p1);
        System.out.println(p2);
    }
}
