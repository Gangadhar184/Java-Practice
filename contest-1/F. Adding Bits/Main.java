//  F. Adding Bits

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * peter misses carry, bit carry is always 0
 *
 * eg:
 *   4 - 100
 * + 6 - 110
 * o/p - 2
 * each bit position is carried independently and carry is ignored
 * as we know in xor only one should be true
    so peter accidently done xor
 *
 *
 *
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(a^b);
    }
}