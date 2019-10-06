import java.util.*;

//Rubbish code
public class KnightMoves2 {
    private static int moves_x[] = {2, 1, -1, -2, -2, -1, 1, 2};
    private static int moves_y[] = {1, 2, 2, 1, -1, -2, -2, -1};
    // private static boolean visited[][] = new boolean[8][];
    private static int final_moves[][] = new int[8][8];

    private static boolean allVisited(boolean visited[][]) {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if(!visited[i][j])
                    return false;
            }
        }
        return true;
    }

    
    public static void moves(boolean visited[][], int x, int y, int k, int prev_x, int prev_y) {
        // System.out.println("x y" + x + " " + y);
        if(visited[x][y]) {
            if(allVisited(visited)) {
                for(int i = 0; i < 8; i++) {
                    for(int j = 0; j < 8; j++) {
                        System.out.print(final_moves[i][j] + "  ");
                    }
                    System.out.println();
                }
                System.exit(0);
            } else {
                // System.out.println(prev_x + " " + prev_y);
                visited[prev_x][prev_y] = false;
                return;
            }
        }

        if (!visited[x][y]) {
            visited[x][y] = true;
            final_moves[x][y] = k++;
        }


        for (int i = 0; i < 8; i++) {
            if (x + moves_x[i] >= 0 && x + moves_x[i] < 8 && y + moves_y[i] >= 0 && y + moves_y[i] < 8) {
                moves(visited, x + moves_x[i], y + moves_y[i], k, x, y);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean visited[][] = new boolean[8][8];
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                visited[i][j] = false;
            }
        }
        
        moves(visited, 0, 0, 0, 0, 0);

        sc.close();
    }
}