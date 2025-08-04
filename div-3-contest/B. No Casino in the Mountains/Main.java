//  B. No Casino in the Mountains

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            int ans = 0;
            int count = 0;
            for(int i = 0; i < n; i++){
                if(a[i] == 0) count++;
                else count = 0;
                if(count == k){
                    ans++;
                    count = -1;
                }
            }
            System.out.println(ans);
        }
    }
}