package ARRAYS;

public class Main{
    public static void main(String[] args) {
        MyArray arr = new MyArray(5);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.print();
        System.out.println(arr.get(1));
        arr.set(1,30);;
        arr.print();
    }
}
