import java.util.*;

public class CodeWars1 {
    public static int countDigits(int n) {
        int digits = 0;
        while(n != 0) {
            digits++;
            n = n/10;
        }
        return digits;
    }
    public static long digPow(int n, int p) {
        // your code
        long sum = 0;
        int digits = countDigits(n);
        int cn = n;
        for(int i = p + digits - 1; i >= p; i--) {
            sum += (long) Math.pow(cn%10, i);
            cn /= 10;
        }
        if(sum % n == 0) {
            return sum/n;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(digPow(89, 1));
        sc.close();
    }
}