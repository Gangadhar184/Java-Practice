//  E. Hady Rides the Train

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long id = sc.nextLong();
        long row = id / 4;
        long col;
        if(row % 2 == 0){
            col = id - row * 4;
        }else{
            if(id - row*4 == 3){
                col = 0;
            }else if(id - row * 4 == 2){
                col = 1;
            }else if(id - row*4 == 1){
                col = 2;
            }else col = 3;
        }
        System.out.print(row + " " + col);
    }
}