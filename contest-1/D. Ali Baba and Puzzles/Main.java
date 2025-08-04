//  D. Ali Baba and Puzzles

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * we have puzzle
 * given a, b , c ,d
 * we need to find operator which is = d
 *
 * eg; input 3 4 5 23
 * -> 3 + 4 * 5 = 23-> true -> yes
 * else no
 * if operator couldnt make d then no
 * check combinations a+b-c==d || a+b*c==d || a-b+c==d || a-b*c==d || a*b+c==d || a*b-c==d)
 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        if(a+b-c==d || a+b*c==d || a-b+c==d || a-b*c==d || a*b+c==d || a*b-c==d){
            System.out.println("YES");
        }else System.out.println("NO");
    }
}