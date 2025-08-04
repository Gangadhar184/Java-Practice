package ALGORITHMS;

import java.util.Scanner;

public class InsertionSort {

    static void insertionSort(int[]arr, int n){
       for(int i = 1; i < n ; i++){
           int j = i;
           while(j > 0 && arr[j-1] > arr[j]){
               int temp = arr[j-1];
               arr[j-1] = arr[j];
               arr[j] = temp;

               j--;

           }
       }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        insertionSort(arr, n);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

//best is O(n) when array is sorted
//worst and avg is O(n^2) TC