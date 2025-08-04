//  U. Float or int

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int integerValue = (int)n;
        double ans = n - integerValue;
        if(ans != 0){
            System.out.printf("float %d %.3f\n", integerValue, ans);
        }
        else {
            System.out.println("int "+integerValue);
        }

    }
}