//  S. Search In Matrix

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < n && !found; i++){
            for(int j = 0; j < m; j++){
                if(a[i][j] == x){
                    found = true;
                    break;
                }
            }
        }
        if(found) System.out.println("will not take number");
        else System.out.println("will take number");
    }
}