//  C. Compare

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        if(x.compareTo(y) < 0) System.out.println(x);
        else System.out.println(y);
        
    }
}