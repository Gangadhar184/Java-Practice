//  X. Convert To Decimal 2

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int onesCount = Integer.bitCount(n);
            int ans = (1 << onesCount) - 1;
            System.out.println(ans);
        }
    }
}