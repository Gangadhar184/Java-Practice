//  G. Conversion

//replace , with space " " and small with cap and viceversa

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
           char c = s.charAt(i);
           if(c == ','){
               res.append(' ');

           }
           else if(Character.isLowerCase(c)){
               res.append(Character.toUpperCase(c));
           }
           else if(Character.isUpperCase(c)){
               res.append(Character.toLowerCase(c));
           }else{
               res.append(c);
           }
        }
        System.out.println(res);
    }
}