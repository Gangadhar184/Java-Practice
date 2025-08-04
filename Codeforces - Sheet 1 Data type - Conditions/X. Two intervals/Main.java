//  X. Two intervals

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        int l = Math.max(l1, l2);
        int r = Math.min(r1, r2);
        if(l <= r){
            System.out.println(l + " "+ r);
        }
        else System.out.println(-1);
    }
}