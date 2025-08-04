import java.io.*;
import java.util.*;

public class Main {
    static FastReader in = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    static final long[] res = new long[1000005];

    public static void main(String[] args) throws IOException {
        int t = in.nextInt();
        while (t-- > 0) {
            solve();
        }
        out.close();
    }

    static void solve() {
        long n1 = in.nextLong(); // max number allowed
        long n2 = in.nextLong(); // required sum

        if (n1 * (n1 + 1) / 2 < n2) {
            out.println("-1");
            return;
        }

        int count = 0;
        long sum = 0;

        for (long j = n1; j >= 1; j--) {
            if (sum + j <= n2) {
                sum += j;
                res[count++] = j;
            }
            if (sum == n2) break;
        }

        for (int i = 0; i < count; i++) {
            out.print(res[i] + " ");
        }
        out.println();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            st = null;
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
