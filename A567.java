import java.math.BigInteger;
import java.util.*;

public class A567 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // long x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        // long max = (x+y)/z;
        BigInteger x = new BigInteger(sc.next());
        BigInteger y = new BigInteger(sc.next());
        BigInteger z = new BigInteger(sc.next());

        BigInteger xL = x.subtract((x.divide(z)).multiply(z));
        BigInteger yL = (y.subtract((y.divide(z)).multiply(z)));

        BigInteger min1 = BigInteger.ZERO;

        if( (xL.add(yL)).compareTo(z) > -1) {
            min1 = (x.subtract((x.divide(z)).multiply(z))).min((y.subtract((y.divide(z)).multiply(z))));
            min1 = min1.subtract((x.mod(z).add(y.mod(z))).mod(z));
        }
        BigInteger max = (x.add(y)).divide(z);
        System.out.println(max + " " + min1);
    }
}