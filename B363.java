import java.util.*;

public class B363 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long sum = 0, res = 0;
        for(int i = 0; i < k; i++) {
            sum += arr[i];
        }

        long prevSum = sum;
        for(int i = 1; i < n - k + 1; i++) {
            long newSum = prevSum - arr[i-1] + arr[i + k -1];
            if(newSum < sum) {
                res = i;
                sum = newSum;
            }
            prevSum = newSum;
        }
        System.out.println(res+1);
    }
}