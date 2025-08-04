//  H. Data Type Guessing

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long a = sc.nextLong();
        if((n*k)%a != 0){
            System.out.println("double");
        }else {
            long ans = n * k / a;
            if (ans <= 2147483647 && ans >= -2147483648){
                System.out.println("int");
            }else {
                System.out.println("long long");
            }
        }
    }
}