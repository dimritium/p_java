import java.util.*;
public class C1185 {

    static int students(int arr[], long lower) {
        Arrays.sort(arr);
        int res = 1;
        long sum = arr[arr.length - 1];
        for(int i = arr.length-2; sum < lower; i--, res++) {
            sum += arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int arr[] = new int[n];
        int res[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long csum = 0;
        for(int i = 0; i < n; i++) {
            csum += arr[i];
            if(csum <= m) {
                res[i] = 0;
            } else {
                res[i] = students(Arrays.copyOf(arr, i), csum - m);
            }
        }
        for(int i : res)
        System.out.print(i + " ");
    }
}
