//  E. Area of a Circle

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double PI = 3.141592653;
        System.out.println(String.format("%.9f", (r*PI*r)));
    }
}