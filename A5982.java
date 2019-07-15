import java.util.*;

public class A5982 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            long sum = 0;
            for(int i = 1; i <= n; i++) {
                if((i & (i-1)) == 0)
                    sum += -i;
                else
                    sum += i;
            }
            System.out.println(sum);
        }
    }
}