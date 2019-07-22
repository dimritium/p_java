import java.util.*;

public class B1195 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int res = 0, tof = 0;
        for(int i = 1; i <= n; i++) {
            tof += i;
            if(tof - (n-i) == k) {
                res = n-i;
                break;
            }
        }
        System.out.println(res);
        sc.close();
    }
}