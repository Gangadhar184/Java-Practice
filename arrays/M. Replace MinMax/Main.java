//  M. Replace MinMax

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] == min){
                arr[i] = max;
            }
            else if(arr[i] == max){
                arr[i] = min;
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}