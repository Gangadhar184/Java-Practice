import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input  = sc.nextLine();
    char operator = ' ';
    int index = -1;
    int ans = 0;
    for(int i = 0; i < input.length(); i++){
        char c = input.charAt(i);
        if(c == '+' || c == '-' || c == '*' || c == '/'){
            operator = c;
            index = i;
            break;
        }
    }
    int a = Integer.parseInt(input.substring(0, index));
    int b = Integer.parseInt(input.substring(index+1));
    switch (operator){
        case '+':
            ans = a+b;
            break;
        case '-':
            ans = a-b;
            break;
        case '*':
            ans = a*b;
            break;
        case '/':
            ans = a/b;
            break;
    }
        System.out.println(ans);
    }
}