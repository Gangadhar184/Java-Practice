//  N. Check Code

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String code = sc.next();
        if(code.length() !=  a+b+1){
            System.out.println("No");
            return;
        }
        if(code.charAt(a) != '-'){
            System.out.println("No");
            return;
        }
        for(int i = 0; i < code.length(); i++){
            if(i == a) continue;
            if(!Character.isDigit(code.charAt(i))){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}