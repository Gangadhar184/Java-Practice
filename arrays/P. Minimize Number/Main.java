//  P. Minimize Number

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
        int count = 0;
       while(true){
           boolean even = true;
           for(int i = 0; i < n; i++){
               if(arr[i] % 2 != 0){
                   even = false;
                   break;
               }
           }
           if(!even) break;
           for(int i = 0; i < n; i++){
               arr[i] /= 2;
           }
           count++;
       }
        System.out.println(count);
    }
}