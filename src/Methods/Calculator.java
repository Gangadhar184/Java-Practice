package Methods;


class Cal{
    public void add(int a, int b) {
        System.out.println(a+b);
    }
    public void sub(int a, int b) {
        System.out.println(a-b);
    }
    public void mul(int a, int b) {
        System.out.println(a*b);
    }
    public void div(double a, double b) {
        System.out.println(a/b);
    }

}


public class Calculator {

    public static void main(String[] args) {
        Cal c = new Cal();
        c.add(1,3);
        c.sub(1,2);
        c.mul(1,2);
        c.div(3,7);
    }
}
