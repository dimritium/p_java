import java.util.*;

public class KnightMoves3 {
    static int N = 8;

    //the order matters a lot in backtracking
    private static int moves_x[] = {2, 1, -1, -2, -2, -1, 1, 2};
    private static int moves_y[] = {1, 2, 2, 1, -1, -2, -2, -1};

    static void printSol(int sol[][]) {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void solveKT() {

        int sol[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sol[i][j] = -1;
            }
        }

        sol[0][0] = 0;
        if(!solveKTUtil(sol, 0, 0, 1)) {
            System.out.println("No sol exist");
        } else {
            printSol(sol);
        }
    }

    static boolean isSafe(int x, int y, int sol[][]) {
        if (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1)
            return true;
        return false;
    }

    static boolean solveKTUtil(int sol[][], int x, int y, int movei) {
        int next_x, next_y;

        if (movei == N * N)
            return true;

        for (int i = 0; i < N; i++) {
            next_x = x + moves_x[i];
            next_y = y + moves_y[i];
            if (isSafe(next_x, next_y, sol)) {
                sol[next_x][next_y] = movei;
                if(solveKTUtil(sol, next_x, next_y, movei + 1)) {
                    System.out.println("Co ords " + next_x + "---" + next_y);
                    return true;
                }
                else {
                    sol[next_x][next_y] = -1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solveKT();
        sc.close();
    }
}