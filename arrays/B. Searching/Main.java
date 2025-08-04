//  B. Searching

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < n; i++){
            if(x == arr[i]){
                System.out.print(i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.print(-1);
        }
    }
}