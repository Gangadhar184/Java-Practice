package ObjectOrientedProgramming.ClassesObjects;

/**
 * Understanding static keyword in java
 *  This belongs to the class itself , not to any object (instance) of the class
 *
 *  static variable -> 1 copy shared by all instances
 *  static methods -> can be called without an object
 *  static blocks -> run once when the class is loaded.
 *  -> They cannot refer to "this" or "super" in any way
 *
 *  Think in Memory: How java loads classes
 *  - Class is loaded -> static fields and static blocks are initialized
 *  - Objects are created -> instance variables are stored in heap for each object
 */

class MyClass {
    static int objectCount = 0; // shared by all objects

    int id;

    public MyClass(int id) {
        this.id = id;
        objectCount++; //increment shared counter
    }
    static void showCount() {
        System.out.println("Total objects: " + objectCount);
    }
}

class Counter {
    static int count = 0; //class level
    int id; //object level

    public Counter(int id) {
        this.id = id;
        count++;
    }
    public void show(){ //instance methodd
        System.out.println("ID: " + id + " count: " + count);
    }
    public static void showCnt() { //static method
        //System.out.println("ID: " + id); error cant access
        System.out.println("Count: " + count);
    }
}


public class StaticKeyWord {
    class UseStatic{
        static int a = 3;
        static int b;

        static void meth(int x){
            System.out.println("x = " + x);
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
        static {
            System.out.println("Static block initialized");
            b = a * 4;
        }
    }

    public static void main(String[] args) {
        MyClass a = new MyClass(1);
        MyClass b = new MyClass(2);
        MyClass.showCount();// objectCount is not specified to a or b. It belongs to the class

        //showCount can be called without any object because it only accesses static data

        Counter c = new Counter(1);
//        Counter.showCnt();
        c.show();
        UseStatic.meth(42);

    }

}
