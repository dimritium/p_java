import java.util.*;

public class A379 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), b = sc.nextInt();
        long res = 0;
        
        for(int i = 1, k = 0; i <= n; i++) {
            res++;
            k++;
            if(k == b) {
                k = 0;
                n += 1;
            }
        }

        System.out.println(res);
    }
}