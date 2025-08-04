//  Q. Count Subarrays

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            long count = 0;
            int length = 1;
            for(int i = 0; i < n; i++){
                if(i == 0) length = 1;
                else{
                    if(arr[i] >= arr[i - 1]){
                        length++;
                    }else length = 1;
                }
                count += length;
            }
            System.out.println(count);
        }
    }
}