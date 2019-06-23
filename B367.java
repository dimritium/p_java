import java.util.*;

public class B367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[1000001];
        for(int i = 0; i < n; i++) {
            arr[sc.nextInt()] += 1;
        }
        for(int i = 1; i < 1000001; i++) {
            arr[i] += arr[i-1];
        }
        int q = sc.nextInt();
        while(q-- > 0) {
            int que = (int)Math.min(sc.nextInt(), 1000000);
            System.out.println(arr[que]);
        }
    }
}