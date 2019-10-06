import java.util.*;
import java.util.stream.*;

public class C1231 {

    static long findNum(int row, int col, int arr[][]) {
            arr[row][col] = (int)Math.min(arr[row + 1][col] - 1, arr[row][col + 1] - 1);
            return  arr[row][col];
    }

    static boolean validate(int arr[][], int row, int col) {
        for(int i = 0; i < row; i++) {
            for(int j = 1; j < col; j++) {
                if(arr[i][j] <= arr[i][j-1])
                    return false;
            }
        }

        for(int i = 0; i < col; i++) {
            for(int j = 1; j < row; j++) {
                if(arr[j][i] <= arr[j-1][i])
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<Integer> lis = Arrays.stream(s.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int row = lis.get(0), col = lis.get(1);
        int arr[][] = new int[row][col];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        
        long sum = 0;
        for(int i = row - 1; i > -1; i--) {
            for(int j = col - 1; j > -1; j--) {
                if(arr[i][j] == 0)  {
                    sum += arr[i][j];
                }
                else {
                    long x = findNum(i, j, arr);
                    sum += x;
                }

            }
        }

        if(validate(arr, row, col)) {
            System.out.println(sum);
        } else {
            System.out.println(-1);
        }
        // System.out.println(sum);

    }
}