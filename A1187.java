import java.util.*;

public class A1187 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int n = sc.nextInt(), s = sc.nextInt(), t = sc.nextInt();
            int inter = s + t - n;
            System.out.println((int)Math.max(s-inter, t-inter) + 1);
        }
    }
}