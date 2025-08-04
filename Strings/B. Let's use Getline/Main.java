//  B. Let's use Getline

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(char c : s.toCharArray()){
            if(c == '\\'){
                break;
            }
            System.out.print(c);
        }
    }
}