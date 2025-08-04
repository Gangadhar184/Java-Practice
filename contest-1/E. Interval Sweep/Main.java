//  E. Interval Sweep

import java.util.*;
import java.lang.*;
import java.io.*;

/***
 * a,b inputs
 * if non-empty interval consist from l to r -> yes(l,l+1,...r) a odd numbers and b even nubers
 * else no
 *
 * eg 2, 3 -> (n=5)  2 odd numbers 3 even this possible when l = 6 and r = 10, (6,7,8,9,10)
 *  proof : 2-3 = -1
 *      2,3 or 3,2,
 *      So, number of odds and evens can differ by at most 1.
 *  *     eg:
 *  *       Length = 5 → possible (3 odd, 2 even) or (2 odd, 3 even)
 *  *       Length = 4 → (2 odd, 2 even)
 *  *   - So, |a - b| > 1 is not possible.
 *  a==0 && b==0 -> no(Edgecase)
 *
 *  eg, 3 1 -> (n=4) 3  odd numbers 1 even numbers , there will be no 3 odd numbers exists in range with less even right
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(Math.abs(a-b)>=2 || (a==0 && b==0)) System.out.println("NO");
        else System.out.println("YES");
    }
}