//  I. Smallest Pair

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < n; i++){
                for(int j = i + 1; j < n; j++){
                    int res = arr[i] + arr[j] + (j-i);
                    if(res < min){
                        min = res;
                    }
                }
            }
            System.out.println(min);
        }

    }
}