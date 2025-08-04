//  L. The Brothers

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String f1 = sc.next();
        String s1 = sc.next();
        String f2 = sc.next();
        String s2 = sc.next();
        if (s1.equals(s2)) {
            System.out.println("ARE Brothers");
        } else {
            System.out.println("NOT");
        }
    }
}