import java.util.*;

public class A332 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt(), d2 = sc.nextInt(), d3 = sc.nextInt();
        
        System.out.println((int)Math.min(d1 + d2 + d3, Math.min(2*d1 + 2*d2, Math.min(2*d2 + 2*d3, 2*d1 + 2*d3))));
    }
}