//  P. Count Words
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int count = 1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }else {
                System.out.println(arr[i-1] + " : "+ count);
                count = 1;
            }
        }
        System.out.println(arr[arr.length - 1] + " : "+count);
    }
}