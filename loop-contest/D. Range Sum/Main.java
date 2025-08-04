//  D. Range Sum

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t --> 0)  {
            long l = sc.nextLong();
            long r = sc.nextLong();
          long max = Math.max(l, r);
           long min = Math.min(l,r);
           l = min;
           r = max;
           long ans1 = ((l-1)*l/2);
           long ans2 = (r*(r+1)/2);
            System.out.println(ans2 - ans1);
        }
    }
}