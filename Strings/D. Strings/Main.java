//  D. Strings

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(a.length() + " " + b.length());
        String ans = a + b;
        System.out.println(ans);
        //swap first letter of 2 string
        String aSwap = b.charAt(0) + a.substring(1);
        String bSwap = a.charAt(0) + b.substring(1);
        System.out.println(aSwap + " " + bSwap);

    }
}

// we can swap String chars using
// substring
// using StringBuilder -> it is mutable
// convert into charArray