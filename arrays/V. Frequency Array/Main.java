//  V. Frequency Array

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] freq = new int[m+1];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            freq[arr[i]]++;
        }
        for(int i = 1; i <= m; i++){
            System.out.println(freq[i]);
        }

    }
}