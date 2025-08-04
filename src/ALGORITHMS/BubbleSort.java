package ALGORITHMS;

import java.util.Scanner;

public class BubbleSort {

    static void bubbleSort(int[] arr, int n){
      for(int i = n - 1; i >= 1; i--){
          boolean swapper = false;
          for(int j = 0; j <= i-1; j++){
              if(arr[j] > arr[j+1]){
                  //swap
                  int temp = arr[j];
                  arr[j] = arr[j + 1];
                  arr[j+1] = temp;
                  swapper = true;
              }
          }
          if(!swapper) break;
      }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        bubbleSort(arr, n);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

/**
 * best o(n)
 * avg and worst( O(n^2)
 */