import java.util.*;

public class A598 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextInt();
            long sum = 0;
            sum = (long)(n*(n+1))/2;
            int pow = (int)(Math.floor(Math.log(n)/Math.log(2))) + 1;
            long pow_s = (long)(2*(Math.pow(2,pow)-1.0));
            System.out.println(sum - pow_s);
        }
        sc.close();
    }
}