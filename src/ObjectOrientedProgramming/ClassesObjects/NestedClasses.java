package ObjectOrientedProgramming.ClassesObjects;

/**
 * the scope of the nested class is bounded by scope of enclosing class. if class B is defined within class A, then B
 * doesn't exist independently of A. A nested class has access to the members, including private members of class in which is nested
 * vice versa is not possible.
 * static and non-static nested classes
 */

class Outer{
    int outer_x =  100;
    void test(){
        Inner inner = new Inner();
        inner.display();
    }

    //Inner class
    class Inner{
        void display(){
            System.out.println("display: outer_x = " + outer_x);
        }
    }
}
public class NestedClasses {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }

}
