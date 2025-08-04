import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] arr = new int[n + 1];
        long[] prefix = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
            prefix[i] = prefix[i - 1] + arr[i];
        }

        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(prefix[r] - prefix[l - 1]);
        }
    }
}
