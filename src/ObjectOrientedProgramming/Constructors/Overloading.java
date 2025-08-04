package ObjectOrientedProgramming.Constructors;

//overloading constructors

class Box3{
    double width;
    double height;
    double depth;

   public Box3(double w, double h, double d) {
        width = w;
        height= h;
        depth = d;

    }

    //constructor when no demension specified
    Box3(){
       width = -1;
       height = -1;
       depth = -1;
    }
    // constructor when cube
    Box3(double length){
       width = height = depth = length;
    }
    double volume(){
       return  width * height * depth;
    }
}

public class Overloading {
    Box3 b1 = new Box3();
    Box3 b2 = new Box3(1,234,42);
    Box3 myCube = new Box3(23);
}
