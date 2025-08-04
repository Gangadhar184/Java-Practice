//  Q. Digits

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        while (t-->0){
            int n = sc.nextInt();
            if(n == 0) System.out.println("0");
            else {
                while(n > 0){
                    int remainder = n % 10;
                    System.out.print(remainder);
                    n /= 10;
                    if(n > 0) System.out.print(" ");
                }
                System.out.println();
            }


        }
    }
}