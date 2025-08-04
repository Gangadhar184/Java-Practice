//  C. Even, Odd, Positive and Negative

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        int positive = 0;
        int negative = 0;
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            if(x%2 == 0){
                even++;
            }else{
                odd++;
            }
            if(x > 0) positive++;
            else if(x < 0) negative++;
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);


    }
}