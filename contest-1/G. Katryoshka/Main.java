//  G. Katryoshka

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * max idols we can make?
 * finding combos
 * ears body mouth
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long e = sc.nextLong();
        long m = sc.nextLong();
        long b = sc.nextLong(); // 90 24 89
        long res = 0;
        //combo of 2e-1m-1b
        long mini = Math.min(e, Math.min(m, b)); //we will get 24 idols
        //then update remaining e and b
        res += mini; //0+24
        e -= mini; // 90-24
        m -= mini; //24-24
        b -= mini; //89-24, here we made comobs without m

        //we will make comobos 2eyes and 1body, e->e/2 and 1b,
        mini = Math.min(e/2, b);//min(33,65)->33
        res += mini;//24+33
        System.out.println(res);
    }
}


 /*
  stuff you should look for
 * int overflow, array bounds
 * special cases (n=1?)
 * do smth instead of nothing and stay organized
 * WRITE STUFF DOWN
 * DON'T GET STUCK ON ONE APPROACH
 */
