//  A. Summation

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        long sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        if(sum < 0) System.out.println(Math.abs(sum));
        else System.out.println(sum);

    }
}