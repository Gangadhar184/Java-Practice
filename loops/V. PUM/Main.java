//  V. PUM

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for(int i = 0; i < n; i++){
            System.out.print(count++ + " ");
            System.out.print(count++ + " ");
            System.out.print(count++ + " ");
            System.out.println("PUM");
            count++;
        }
    }
}