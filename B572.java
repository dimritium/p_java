import java.util.*;

public class B572 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        // int flag = 0;

        if(arr[n-1] >= arr[n-2] + arr[n-3]) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for(int i = n - 1; i > -1; i-=2) {
                System.out.print(arr[i] + " ");
            }
            for(int i = n%2; i < n; i += 2) {
                System.out.print(arr[i] + " ");
            }
        }
        
    }
}