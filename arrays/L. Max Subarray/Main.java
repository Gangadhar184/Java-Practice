import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                int maxVal = A[i];
                for (int j = i; j < N; j++) {
                    maxVal = Math.max(maxVal, A[j]);
                    result.add(maxVal);
                }
            }
            for (int val : result) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
//for (int i = 0; i < N; i++) {
//                for (int j = i; j < N; j++) {
//                    int maxVal = A[i]; // Initialize max
//                    for (int k = i; k <= j; k++) {
//                        if (A[k] > maxVal) {
//                            maxVal = A[k];
//                        }
//                    }
//                    System.out.print(maxVal + " ");
//                }
//            }