//  S. Sum of Consecutive Odd Numbers

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int start = Math.min(x,y);
            int end = Math.max(x,y);
            int sum = 0;
            for(int i = start + 1; i < end; i++){
                if( i % 2 != 0){
                    sum += i;
                }
            }
            System.out.println(sum);

        }
    }
}