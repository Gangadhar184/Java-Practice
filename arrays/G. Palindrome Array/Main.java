//  G. Palindrome Array

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
        int end = n - 1;
        boolean isPalindrome = true;
        while(start < end){
            if(arr[start] != arr[end]){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if(isPalindrome) System.out.println("YES");
        else System.out.println("NO");
    }
}
/**
 * variation
 * int merges = 0;
 *
 *         while(start < end){
 *             if(arr[start] == arr[end]){
 *                 start++;
 *                 end--;
 *             } else if(arr[start] < arr[end]){
 *                 arr[start + 1] += arr[start];
 *                 start++;
 *                 merges++;
 *             } else {
 *                 arr[end - 1] += arr[end];
 *                 end--;
 *                 merges++;
 *             }
 *         }
 *
 *         System.out.println(merges);
 */