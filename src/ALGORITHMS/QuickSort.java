package ALGORITHMS;

import java.net.Socket;

public class QuickSort {

    static int partition(int[] arr, int l, int r, int pivot){
        while (l <= r) {
            while (arr[l] < pivot) {
                l++;
            }
            while (arr[r] > pivot) {
                r--;
            }
            if(l <= r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;

                l++;
                r--;
            }
        }
        return l;
    }

    static void quickSort(int[] arr, int l, int r){
        if(l >= r) {
            return;
        }
        int pivot = arr[l + (r - l) / 2];
        int partition_index = partition(arr, l, r, pivot);
        quickSort(arr, l, partition_index-1);
        quickSort(arr, partition_index, r);
    }

    public static void main(String[] args) {
        int[] arr = {50, 23, 9, 10, 2};
        System.out.println("Previously: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        quickSort(arr, 0, arr.length - 1);
        System.out.println("After sorting: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
