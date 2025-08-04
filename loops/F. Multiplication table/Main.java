//  F. Multiplication table

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= 12; i++){
            System.out.println(n+" "+"*"+" "+i+" "+"="+" "+ n*i);
        }
    }
}