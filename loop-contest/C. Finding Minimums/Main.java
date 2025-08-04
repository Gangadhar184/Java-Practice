//  C. Finding Minimums

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        double ceilValue = n / (k * 1.0);
        double kSize = Math.ceil(ceilValue);
        int count = 0;
        for(int i = 0; i < kSize; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < k; j++){
                if(count < n){
                    if(min > arr[count]){
                        min = arr[count];
                    }
                    count++;
                }
                else break;
            }
            System.out.print(min+" ");
            if(count == n) break;
        }
    }
}