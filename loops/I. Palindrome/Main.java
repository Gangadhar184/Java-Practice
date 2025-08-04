import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int originalNumber = n;
        int reversed = 0;

        while (n != 0) {
            int remainder = n % 10;
            reversed = reversed * 10 + remainder;
            n = n / 10;
        }

        System.out.println(reversed);

        if (originalNumber == reversed) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
