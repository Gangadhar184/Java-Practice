//  M. Capital or Small or Digit

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        if (x >= '0' && x <= '9') {
            System.out.println("IS DIGIT");
        } else if (x >= 'A' && x <= 'Z') {
            System.out.println("ALPHA");
            System.out.println("IS CAPITAL");
        } else if (x >= 'a' && x <= 'z') {
            System.out.println("ALPHA");
            System.out.println("IS SMALL");
        }
    }
}