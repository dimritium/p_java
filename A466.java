import java.util.*;

public class A466 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        if( n >= m) {
            System.out.println((int)Math.min(n*a, Math.min(n/m * b + n%m * a, Math.ceil(n/(m*1.0))*b)));
        } else {
            System.out.println((int) Math.min(n*a, b));
        }
    }
}