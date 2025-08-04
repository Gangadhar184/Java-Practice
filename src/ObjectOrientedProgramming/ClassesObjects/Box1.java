package ObjectOrientedProgramming.ClassesObjects;

// adding methods in class

class BoxDemo1{
    double width;
    double height;
    double depth;

    double volume() {
        return  width * height * depth;
    }

    // dimensions of the box
    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}

 class Box1 {
     public static void main(String[] args) {
         BoxDemo1 b1 = new BoxDemo1();
         double vol;
         b1.setDim(10.23, 23.2343, 2343);
         vol = b1.volume();
         System.out.println(vol);
     }
}
