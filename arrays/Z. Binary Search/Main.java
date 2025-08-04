//  Z. Binary Search

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0; i < q; i++){
            int x = sc.nextInt();
            if(binarySearch(a,x)) System.out.println("found");
            else System.out.println("not found");
        }
    }
    static boolean binarySearch(int[] arr, int target){
        int left = 0, right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target) return  true;
            else if(arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return  false;
    }
}