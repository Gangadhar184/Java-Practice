//  D. Fixed Password
/**
 *
 * as soon as we see 1999 correct password is found and exit the loop
 *
 * i/p 2200
 *     1020
 *     1999
 *     1000
 *     9999
 * o/p wrong
 *     wrong
 *     correct
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int x = sc.nextInt();
            if(x == 1999){
                System.out.println("Correct");
                break;
            }else{
                System.out.println("Wrong");
            }
        }
    }
}