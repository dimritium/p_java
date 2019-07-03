import java.util.*;

public class A277 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println((long)((Math.ceil(n/2.0)*Math.pow(-1, n%2))));
    }
}