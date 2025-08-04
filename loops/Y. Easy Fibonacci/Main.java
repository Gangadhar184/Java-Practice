//  Y. Easy Fibonacci
//  Input
//7
//Output
//0 1 1 2 3 5 8

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 0; i < n; i++){
            System.out.print(a);
            if(i < n - 1) System.out.print(" ");
            int next = a+b;
            a = b;
            b = next;
        }
    }
}