//  N. Numbers Histogram

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            int x = sc.nextInt();
            for(int j = 0; j < x; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}