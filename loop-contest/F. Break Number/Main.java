//  F. Break Number

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long nums;
        long max = 0;
        for(int i = 0; i < n; i++){
            nums = sc.nextLong();
            long count = 0;
            while(nums % 2 == 0){
                nums/=2;
                count++;
            }
            if(count > max){
                max = count;
            }
        }
        System.out.print(max);
    }
}