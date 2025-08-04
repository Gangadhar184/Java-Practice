import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lastDigit = n % 10;

        int firstDigit = n / 10;
        if (lastDigit == 0) {
            System.out.println("YES");
            return;
        }

        if (firstDigit != 0 && (firstDigit % lastDigit == 0 || lastDigit % firstDigit == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        int a = 1;
        int b = 2;
        int c = 3;
        if(a<b && a < c){
            System.out.println(a);
        }else if(b < a && b < c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
