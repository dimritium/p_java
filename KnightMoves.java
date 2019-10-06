import java.util.*;

public class KnightMoves {
    private static int moves_x[] = {2, 1, -1, -2, -2, -1, 1, 2};
    private static int moves_y[] = {1, 2, 2, 1, -1, -2, -2, -1};
    
    private static void printSol(int arr[][]) {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isSafe(int x, int y, int sol[][]) {
        if(x >=0 && x < 8 && y >= 0 && y < 8 && sol[x][y] == -1)
            return true;
        return false;
    }

    private static void move() {
        int sol[][] = new int[8][8];
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                sol[i][j] = -1;
            }
        }
        sol[0][0] = 0;
        
        if(!moveUtil(0, 0, sol, 1)) {
            System.out.println("No Solution exists");
        } else {
            printSol(sol);
        }
    
    }

    private static boolean moveUtil(int x, int y, int sol[][], int movei) {
        int next_x, next_y;
        
        if(movei == 64)
            return true;

        for(int i = 0; i < 8; i++) {
            next_x = x + moves_x[i];
            next_y = y + moves_y[i];
            if(isSafe(next_x, next_y, sol)) {
                sol[next_x][next_y] = movei;
                if(moveUtil(next_x, next_y, sol, movei + 1)) {
                    return true;
                } else {
                    sol[next_x][next_y] = -1;
                }
            }
        }

        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        move();
        sc.close();
    }
}