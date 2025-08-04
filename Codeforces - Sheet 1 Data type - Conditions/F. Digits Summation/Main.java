//  F. Digits Summation

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long nLastdigit = n % 10;
        long mLastdigit = m % 10;
        System.out.println(nLastdigit + mLastdigit);
    }
}