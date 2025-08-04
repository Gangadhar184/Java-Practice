import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        int[] arr = {a, b, c};
        Arrays.sort(arr);

        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }

        System.out.println();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
