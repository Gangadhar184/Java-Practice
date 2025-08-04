//  E. Lowest Number - print min and its index

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
        int min = arr[0];
        int index = 1;
        for(int i = 1; i < n; i++){
            if(arr[i] < min){
                min = arr[i];
                index = i + 1;
            }
        }
        System.out.println(min + " " + index);

    }
}