package ObjectOrientedProgramming.ClassesObjects;
// we will see how to pass objects as parameters



class Test{
    int a, b;
    Test(int i, int j) {
        a = i;
        b = j;
    }

    //return true if o is equal to invoking object
    boolean equals(Test o) {
        if(o.a == a && o.b == b) return  true;
        else return false;
    }
}
public class PrametersObjects {
    public static void main(String[] args) {
        Test ob1 = new Test(100, 200);
        Test ob2 = new Test(100, 200);
        Test ob3 = new Test(-1, -1);
        System.out.println(ob1.equals(ob2)  );
        System.out.println(ob2.equals(ob3));
    }
}
/**
 * equals() method inside Test compares two objects for equality and retrusnt the result, it compares the invoking
 * object with the one that is passed. if they contain the same value then method returns true otherwise false
 */