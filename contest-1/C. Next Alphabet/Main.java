//  C. Next Alphabet

import java.util.*;
import java.lang.*;
import java.io.*;


/**
 * given char, print next char
 * suppose a is input b is output
 * if we go to last letter z we have to return a
 *
 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c == 'z') {
            System.out.println('a');
            return;
        }


        System.out.println((char)(c+1));
    }
}