//  B. Even Numbers

import java.util.*;
        import java.lang.*;
        import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean evenFound = false;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                System.out.println(i);
                evenFound = true;

            }

        }
        if(!evenFound){
            System.out.println(-1);
        }

    }
}