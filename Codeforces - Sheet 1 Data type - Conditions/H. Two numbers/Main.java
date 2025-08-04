import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        double result = (double) n / m;

        System.out.println("floor " + n + " / " + m + " = " + (int)Math.floor(result));
        System.out.println("ceil " + n + " / " + m + " = " + (int)Math.ceil(result));
        System.out.println("round " + n + " / " + m + " = " + Math.round(result));
    }
}
