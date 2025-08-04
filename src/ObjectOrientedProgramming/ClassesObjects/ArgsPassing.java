package ObjectOrientedProgramming.ClassesObjects;

// java is the call by value -> copies the value of an argument into the formal parameter of subroutine.
// so changes  made in the parameter of the subroutine have no effect on the argument

// Second method - pass by value of reference -> reference to an argument(not the value of argument) is passed to the parameter
// inside the subroutine this reference is used to access the actual argument specified in the call, so changes made in
// the parameter will affect the argument used in the call

// primitives is call by value-> what occurs to the parameter that receives the argument has no efect outside the method
// JAVA is pass by value of the reference. The object can be changed but not the reference itself
class Test2 {
    void meth(int i, int j){
        i *= 2;
        j *= 2;
    }
}
// call by value of the reference

class TestObj{
    int x;
    void change(TestObj obj) {
        obj.x = 42;
    }
}
public class ArgsPassing {
    public static void main(String[] args) {
        Test2 ob = new Test2();
        int a = 13;
        int b = 13;

        System.out.println("a and b before call " + a + " " + b);
        ob.meth(a, b);
        System.out.println("a and b after call: " + a + " " + b);

        TestObj t = new TestObj();
        t.x = 10;
        System.out.println("Before: " + t.x);
        t.change(t);
        System.out.println("After: " + t.x);
    }
}
