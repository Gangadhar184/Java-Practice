//  F. Way Too Long Words

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            if(s.length() <= 10) System.out.println(s);
            else{
                System.out.println(s.charAt(0)+""+(int)(s.length()-2)+""+s.charAt(s.length()-1));
            }
        }

    }
}