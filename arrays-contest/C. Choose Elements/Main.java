import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        long sum = 0;
        for(int i = 0; i < k ; i++ ){
            if(arr[i] < 0) break;
            sum += arr[i];
        }
        System.out.println(sum);

    }
    //sort in descending order
    static void bubbleSort(int[] arr){
        for(int i = arr.length-1; i >= 1; i--){
            boolean isSwapped = false;
            for(int j = 0; j <= i-1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped) break;
        }
    }
}
