//  E. Max

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        for(int i = 1; i <= n; i++){
            int x = sc.nextInt();
            if(x > max){
                max = x;
            }
        }
        System.out.println(max);
    }
}