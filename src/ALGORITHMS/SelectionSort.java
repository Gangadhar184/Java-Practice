package ALGORITHMS;


import java.util.Scanner;

public class SelectionSort {
    static void selectionSort(int[] arr, int n){
        for(int i = 0; i <= n-2; i++){
            int mini = i;
            for(int j = i; j <= n-1; j++){
                if(arr[j] < arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        selectionSort(arr, n);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

//TC - O(n^2)