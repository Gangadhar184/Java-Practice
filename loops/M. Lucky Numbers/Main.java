//  M. Lucky Numbers

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static boolean isLucky(int n){
        while(n > 0){
            int digit = n % 10;
            if(digit != 4 && digit != 7){
                return false;
            }
            n /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean found = false;
        for(int i = a; i <= b; i++){
            if(isLucky(i)){
                System.out.print(i + " ");
                found = true;
            }
        }
        if(!found){
            System.out.println("-1");
        }

    }
}