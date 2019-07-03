import java.util.*;

public class A326 {
    public static void initArr(int arr[][], int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 2; j++) {
                arr[i][j] = 0;
            }
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[][] = new int[n][2];
       initArr(arr, n);
       for(int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int k = 1, meat = 0;
        long res = arr[0][0] * arr[0][1];
        int prev_m = arr[0][1];
        while(k < n) {
            meat = 0;
            while(k < n && prev_m <= arr[k][1]) {
                meat += arr[k][0];
                k++;
            }
            res += meat * prev_m;
            if(k < n)
            prev_m = arr[k][1];
        }
        System.out.println(res);
    }
}