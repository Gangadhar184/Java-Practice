//  I. Palindrome

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int start = 0;
        int end = s.length() - 1;
        boolean isPalindrome = true;
        while (start < end){
            if(s.charAt(start) != s.charAt(end) ){
                isPalindrome = false;
                break;

            }
            start++;
            end--;
        }
        if(isPalindrome) System.out.println("YES");
        else System.out.println("NO");
    }
}