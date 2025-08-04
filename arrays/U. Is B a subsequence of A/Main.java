import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        if (isSubsequence(a, b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean isSubsequence(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (a[i] == b[j]) {
                j++;
            }
            i++;
        }
        return j == m;
    }
}
