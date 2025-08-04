//  A. Create A New String

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(s.length() + " " + t.length());
        System.out.print(s + " " + t);
    }
}