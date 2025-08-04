//  J. Multiples

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a % b == 0 || b % a == 0) {
            System.out.println("Multiples");
        }else{
            System.out.println("No Multiples");
        }
    }
}