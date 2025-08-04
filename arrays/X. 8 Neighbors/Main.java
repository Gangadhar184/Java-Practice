//  X. 8 Neighbors

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * dx, dy as 8 directions of 8 neighbours
 * we can iterate all neighbours and check if its in bounds
 *  If its withbounds and it is not x , -> no
 *  if all are x -> yes
 *
 *  x = {-1, -1, -1, 0, 0, 1, 1, 1};
 *  y = {-1, 0, 1, -1, 1, -1, 0, 1};
 */



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        char[][] grid = new char[N][M];

        for (int i = 0; i < N; i++) {
            String row = sc.nextLine();
            grid[i] = row.toCharArray();
        }

        int X = sc.nextInt() - 1;
        int Y = sc.nextInt() - 1;

        //  8 directions (dx, dy)
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        boolean allNeighborsX = true;

        for (int d = 0; d < 8; d++) {
            int newX = X + dx[d];
            int newY = Y + dy[d];

            // Check if neighbor is within grid bounds
            if (newX >= 0 && newX < N && newY >= 0 && newY < M) {
                if (grid[newX][newY] != 'x') {
                    allNeighborsX = false;
                    break;
                }
            }
        }

        if(allNeighborsX) System.out.println("yes");
        else System.out.println("no");
    }
}
