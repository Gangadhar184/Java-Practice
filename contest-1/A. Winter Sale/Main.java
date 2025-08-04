import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int x = sc.nextInt();
        int p = sc.nextInt();
        double originalPrice = p / (1 - (x / 100.0));
        System.out.printf("%.2f\n", originalPrice);
    }
}
