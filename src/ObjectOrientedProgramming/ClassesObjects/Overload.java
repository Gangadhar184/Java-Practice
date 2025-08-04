package ObjectOrientedProgramming.ClassesObjects;


class OverloadDemo{
    void test(){
        System.out.println("No parameters");
    }
    void test(int a, int b) {
        System.out.println(a + b);
    }
    void test(double a){
        System.out.println(a);
    }
}
public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i = 343;
        ob.test();
        ob.test(10,23);
        ob.test(343.434);
        ob.test(i); // this will invoke test(double)
    }
}
