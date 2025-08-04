//  Y. The last 2 digits

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        a%=100;
        b%=100;
        c%=100;
        d%=100;
        long ans = a * b * c * d;
        long remainder = ans % 100;
        if(remainder < 10) System.out.println(0 + remainder);
        else System.out.println(remainder);
    }
}