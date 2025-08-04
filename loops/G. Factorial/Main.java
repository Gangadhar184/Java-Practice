//  G. Factorial

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long fact = 1;
            if(n == 0) fact = 1;
            else{
                for(int i = 1; i <= n; i++){
                    fact *= i;
                }
            }
            System.out.println(fact);
        }
    }
}