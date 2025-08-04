//  E. Alternating Array

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int pos = 0;
        int neg = 0;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                if(arr[i] < 0){
                    pos++;
                }
                if(arr[i] > 0) neg++;
            }
            else{
                if(arr[i] < 0) neg++;
                if(arr[i] > 0) pos++;
            }
        }
        System.out.println(Math.min(pos,neg));
    }
}