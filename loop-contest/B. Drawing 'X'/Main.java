//  B. Drawing 'X'

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                //center
                if(i == j && i + j == n - 1){
                    System.out.print("X");
                }else if(i == j) {
                    System.out.print("\\");
                }else if(i + j == n - 1){
                    System.out.print("/");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}