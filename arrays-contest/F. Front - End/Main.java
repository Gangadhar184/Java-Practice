//  F. Front - End

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
        int start = 0;
        int end = n-1;
        while(start <= end){
            System.out.print(arr[start++] + " ");
            if(start <= end){
                System.out.print(arr[end--] + " ");
            }
        }
    }
}