//  R. Age in Days

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int years = n / 365;
        int remaining = n % 365;
        int months = remaining / 30 ;
        int days = remaining % 30;
        System.out.println(years + " years");
        System.out.println(months + " months");
        System.out.println(days + " days");
    }
}
/*
* 800 / 365 = 2 years
* 800%30->remaining
* remaining/30-> months
* remaining%30->days
* */