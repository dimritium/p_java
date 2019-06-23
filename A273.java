import java.util.*;

public class A273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int res = sum % 5 == 0 && sum !=0 ? sum/5 : -1;
        System.out.println(res);
    }
}