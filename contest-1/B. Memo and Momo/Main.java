//  B. Memo and Momo

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * memo -> a positive
 * momo -> b positive
 *
 * 15 7 3
 * 15/3==
 *
 * Rules: a / k == 0 and b / k ==0 , both win
 *          a/k==0 and b /k != 0 Memo win
 *          b/k==0 and a/k!= 0 momo win
 *          if both ! div by k a/k b/k!=0 noone
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        if(a%k == 0 && b%k == 0) {
            System.out.println("Both");
        }else if (a % k == 0 && b % k != 0) {
            System.out.println("Memo");
        }else if (b % k == 0 && a % k != 0){
            System.out.println("Momo");
        }else {
            System.out.println("No One");
        }
    }
}