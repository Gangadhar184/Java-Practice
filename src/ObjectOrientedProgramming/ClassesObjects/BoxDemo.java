package ObjectOrientedProgramming.ClassesObjects;

/**
 *  how object reference variables work in Java.
 *
 * - b1 and b2 are reference variables of type Box.
 * - Initially, b2 = b1 means both b1 and b2 point to the same Box object in memory.
 * - If we later do b2 = new Box(), b2 will point to a new object,
 *   and b1 will still point to the original one.
 */

class Box {
    double width;
    double height;
    double volume;
}

public class BoxDemo {
    public static void main(String[] args) {
        // Create a new Box object and assign it to b1
        Box b1 = new Box();

        // Assign the reference of b1 to b2
        Box b2 = b1;

        // Both b1 and b2 refer to the same object
        b1.width = 10;
        b1.height = 5;
        b1.volume = b1.width * b1.height;

        System.out.println("b1 Volume: " + b1.volume);
        System.out.println("b2 Volume (same as b1): " + b2.volume);

        // Now create a new Box object and assign it to b2
        b2 = new Box();
        b2.width = 2;
        b2.height = 3;
        b2.volume = b2.width * b2.height;

        System.out.println("After creating new object for b2:");
        System.out.println("b1 Volume: " + b1.volume); // unchanged
        System.out.println("b2 Volume (new object): " + b2.volume); // new value
    }
}
