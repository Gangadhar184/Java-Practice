
/* stuff I should look for
 * int overflow, array bounds
 * special cases (n=1?)
 * do smth instead of nothing and stay organized
 * WRITE STUFF DOWN
 * DON'T GET STUCK ON ONE APPROACH
 */
import java.io.*;
import java.util.*;
public  class Main{
    static FastReader in = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    static final int MOD = 1000000007;
    static final int INF = Integer.MAX_VALUE;
    static final int MIF = Integer.MIN_VALUE;
    static final double EPS = 1e-9;


    public static void main(String[] args) throws IOException {
        int t = in.nextInt();
        while(t-->0){
            solve();
        }
        out.close();
    }
    static void solve(){
        // solution

    }
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;

        public  FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while(st == null || !st.hasMoreElements())  {
                try{
                    st = new StringTokenizer(br.readLine()) ;

                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            return  st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine() {
            st = null; // reset tokenizer
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