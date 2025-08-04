//  R. Permutation with arrays

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);

        boolean isPerm = true;
        for(int i = 0; i < n; i++){
            if(a[i] != b[i]) {
                isPerm = false;
                break;
            }
        }
        if(isPerm) System.out.println("yes");
        else System.out.println("no");
    }
}