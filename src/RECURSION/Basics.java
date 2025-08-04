package RECURSION;

//recursive function call itself
//in recursive base case is imp
//we should trust the function when we are making recursive call

public class Basics {
//    static void sayHello(int n){
//
//        if(n == 0) return; //base case or stopping case
//        //System.out.println("Hello " + n) ;
//        //sayHello(n-1); // we are trusting this function, recursive leap of faith
//
//        sayHello(n-1);
//        System.out.println("Hello " + n);
//
//    }
    static int sum(int n){
        if(n == 0) return 0;
        return n + sum(n - 1);
    }





    public static void main(String[] args) {
//        sayHello(10);
        int ans = sum(10);
        System.out.println(ans);
    }
}
