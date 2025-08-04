package ALGORITHMS;

import java.util.Arrays;

public class CyclicSort {
    static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1; // 1 to n
            if(arr[i] != arr[correctIndex]){
                //swap
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else {
                i++; //already swapped
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
