//  W. Mathematical Expression

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char s = sc.next().charAt(0);
        int b = sc.nextInt();
        char q = sc.next().charAt(0);
        int c = sc.nextInt();
        boolean validOperator = true;
        if(s == '+' && a+b!=c){
            System.out.println(a+b);
            validOperator = false;
        }
        if(s == '-' && a-b!=c){
            System.out.println(a-b);
            validOperator = false;
        }
        if(s == '*' && a*b!=c){
            System.out.println(a*b);
            validOperator = false;
        }
        if(validOperator){
            System.out.println("Yes");
        }

    }
}