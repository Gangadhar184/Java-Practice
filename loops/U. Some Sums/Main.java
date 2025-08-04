//  U. Some Sums

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int total = 0;
        for(int i = 1; i <= n; i++){
            int sum = 0;
            int num = i;
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            if(sum >= x && sum <= y){
                total += i;
            }
        }
        System.out.println(total);
    }
}