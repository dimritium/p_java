import java.util.*;

public class B1197 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag = true;
        for(int i = 1; i < n-1; i++) {
            if(arr[i-1] > arr[i] && arr[i] < arr[i+1]) {
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}