//  G. Even Hate Odd

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int cntEven = 0;
            int cntOdd = 0;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                if(arr[i] % 2 == 0) cntEven++;
                else cntOdd++;
            }
            if(n%2 != 0) System.out.println(-1);
            else{
                int odds = n / 2;
                int evens = n / 2;

                int evenChanges = Math.max(0, evens - cntEven);
                int oddChanges = Math.max(0, odds - cntOdd);
                int ans = evenChanges + oddChanges;
                System.out.println(ans);

            }
        }
    }
}