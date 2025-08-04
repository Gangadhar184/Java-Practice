package STRINGPractice;

import java.net.Socket;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String a = new String("Onepiece");
        String b = "Onepiece";

        //length;
        System.out.println(a.length());

        //.equals vs ==
        System.out.println(a == b); //checks the reference of the string
        System.out.println(a.equals(b)); //checks the content inside the string

        //charAt
        System.out.println(a.charAt(3));
        //toLowerCase
        System.out.println(a.toLowerCase());
        //substring
        System.out.println(a.substring(1,4));//excludes end index and inclusive of start index



//        System.out.println(a.);

        String a1 = "odo" + a.substring(1);
        System.out.println(a1);

        for(int i = 0; i < a.length(); i++){
            System.out.print(a.charAt(i)+" ");
        }

        //trim
        System.out.println(a.trim());

        String sa = " ";
        System.out.println(sa.isEmpty());//only true when length is 0

        String d = "";
        System.out.println(d.isBlank());

        System.out.println(a.toString());

        System.out.println(a.startsWith("a"));
        System.out.println(a.endsWith("e"));
        System.out.println(a.contains("p"));
        System.out.println(b.compareTo(a));//compares lexicographically
        
        String s = "onepiece";
        char[] ch = s.toCharArray();
        for(char c : ch){
            System.out.print(c+" ");
        }

        String strn = "onepiece is goat";
        String[] words = strn.split(" ");
        for(String word: words){
            System.out.println(word);
        }

        String str2 = "apple, orange, lemon";
        String[] fruits = str2.split(",");
        System.out.println(Arrays.toString(fruits));

        String[] arr = str2.split(",", 2);
        System.out.println(Arrays.toString(arr));


        //valueOf - converts any data type into its string representtaton

        int x = 23;
        System.out.println(String.valueOf(x));

        char[] ch1  = {'J', 'a', 'v',  'a'};
        String strw = String.valueOf(ch1);
        System.out.println(strw);

        String s4 = null;
        System.out.println(String.valueOf(s4)); //"null"
        //if we use toString it gives null pointer exception

    }
}
