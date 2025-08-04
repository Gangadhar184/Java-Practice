package ObjectOrientedProgramming.Constructors;

/***
 * Need of this:
 *  Sometimes method will need to refer to the obj that invoked it. To allow this, java defines the "this keyword"
 *  -> this can be used inside any method to refer to the current object.
 *  -> this is always reference to the object on which the method is invoked.
 *  -> use this anywhere a reference to an object of current class type is permitted
 */


public class Box {
    double width;
    double height;
    double depth;

    public Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    // instance variable hiding -> as we know it is illegal to local variables with same name inside the same scope.
    // but here we can have instance variables names as parameters inside constructor-> local variables have same name as instance variables
    // local variable hides the instance variable, but we can overcome this problem with "this" keyword
//    public Box(double width, double height, double depth) {
//        this.width = width;
//        this.height = height;
//        this.depth = depth;
//    }

    //both of the above constructor works , its developer preference of choosing it

    public double volume(){
        return width * height * depth;
    }

    public static void main(String[] args) {
        Box b1 = new Box(10, 20, 30.44);
        double vol = b1.volume();
        System.out.println(vol);
    }
}
