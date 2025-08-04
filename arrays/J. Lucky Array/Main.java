//  J. Lucky Array

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
        boolean found = false;
        int freq = 0;
        int min = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] < min)  {
                min = arr[i];
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] == min) freq++;
        }
        if(freq % 2 == 1) System.out.println("Lucky");
        else System.out.println("Unlucky");
    }
}