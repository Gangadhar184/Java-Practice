package Methods;

/**
 *
 */
//static method example
class MathUtils {
    static int add(int a, int b) {
        return a + b;
    }
    static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }
    static boolean isEven(int number){
        return number % 2 == 0;
    }
    static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}

class Constants{
    static final double PI = 3.14159;
    static double getPI() {
        return PI;
    }

    //counter
    private static int totalObjectCreated = 0;
    static int getTotalObjectCreated(){
        return totalObjectCreated;
    }
    static void incrementCounter(){
        totalObjectCreated++;
    }
}



public class DEMO {
}
