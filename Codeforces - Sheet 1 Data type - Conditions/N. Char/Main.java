//  N. Char

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        if(x >= 'a' && x <= 'z') {
            x = (char)(x - 32);
        }else if(x >= 'A' && x <= 'Z'){
            x = (char)(x + 32);
        }
        System.out.println(x);
    }
}