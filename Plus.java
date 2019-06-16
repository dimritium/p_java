import java.util.*;

public class Plus {
    public static boolean valid_pos(int i, int j, int h, int m) {
        if((i > 0 || j > 0) && (i < h || j < m)) {
            return true;
        }
        return false;
    }

    public static boolean isplus(char arr[][], int i, int j, int h, int w) {
        int lf = 1, rf = 1, df = 1, uf = 1;
        for(int u = i-1; u > -1; u--) {
            if(arr[u][j] == '.')
                uf = -1;
            else if(arr[u][j] == '*' && uf == -1) {
                uf = 0;
                break;
            }
        }
        for(int d = i+1; d < h; d++) {
            if(arr[d][j] == '.')
                df = -1;
            else if(arr[d][j] == '*' && df == -1) {
                df = 0;
                break;
            }
        }
        for(int r = j+1; r < w; r++) {
            if(arr[i][r] == '.')
                rf = -1;
            else if(arr[i][r] == '*' && rf == -1) {
                rf = 0;
                break;
            }
        }
        for(int l = j - 1; l > -1; l--  ) {
            if(arr[i][l] == '.')
                lf = -1;
            else if(arr[i][l] == '*' && lf == -1) {
                lf = 0;
                break;
            }
        }
        if(lf != 0 && rf !=0 && uf != 0 && df != 0)
            return true;
        return false;
    }

    public static boolean other_empty(char arr[][], int i, int j, int h, int m) {
        int flag = 1;
        for(int r = 0; r < h; r++) {
            for(int c = 0; c < m; c++) {
                if( (r != i && c != j) && arr[r][c] == '*') {
                    flag = 0;
                    break;
                } 
            }
        }
        if(flag == 0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), m = sc.nextInt();
        char[][] arr = new char[h][m];
        
        for(int i = 0; i < h; i++) {
            String s = sc.next();
            arr[i] = s.toCharArray();
        }

        int mid_i, mid_j;
        for(int i = 0; i < h; i++)
            for(int j = 0; j < m - 2; j++) {
                if( i > 0 && i < h - 1) {
                    if(arr[i][j] == '*' && arr[i][j+1] == '*' && arr[i][j+2] == '*' && arr[i-1][j+1] == '*' && arr[i+1][j+1] == '*') {
                        mid_i = i;
                        mid_j = j+1;
                        if(isplus(arr, mid_i, mid_j, h, m) && other_empty(arr, mid_i, mid_j, h, m)) {
                            System.out.println("YES");
                            System.exit(0);
                        } else {
                            System.out.println("NO");
                            System.exit(0);
                        }
                    }
                }
            }
        System.out.println("NO");
    }
}
