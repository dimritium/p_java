import java.util.*;

public class Button {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 0;
        // for(int i = 0; i < n; i++) {
        //     result += (n-i) + (n - i - 1)*i;
        // }
        result = (((long)Math.pow(n, 3) + 5*n)/6);
        System.out.println(result);
    }
}