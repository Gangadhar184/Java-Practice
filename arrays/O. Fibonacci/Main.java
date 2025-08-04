//  O. Fibonacci

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(0);
        } else if (n == 2) {
            System.out.println(1);
        } else {
            long a = 0, b = 1, fib = 0;
            for (long i = 3; i <= n; i++) {
                fib = a + b;
                a = b;
                b = fib;
            }
            System.out.println(fib);
        }
    }
}