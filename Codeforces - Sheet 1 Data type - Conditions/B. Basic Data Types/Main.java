//  B. Basic Data Types

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long b = sc.nextLong();
        char ch = sc.next().charAt(0);
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        System.out.println(a);
        System.out.println(b);
        System.out.println(ch);
        System.out.println(f);
        System.out.println(String.format("%.1f", d));
    }


}