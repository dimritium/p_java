import java.util.*;

public class A569 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long arr[] = new long[101];
        arr[0] = 1;
        for(int i = 1; i < 100; i++) {
            arr[i] = arr[i-1] + 4*i;
        }
        int q = sc.nextInt();
        System.out.println(arr[q-1]);
    }
}