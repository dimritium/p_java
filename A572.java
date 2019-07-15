import java.util.*;

/**
 * code is not accepted, add a check if the string already has unequal 0's and
 * 1's python solution with same file name present
 */
public class A572 {
    public static boolean isEqual(char arr[]) {
        // boolean res = false;
        int ones = 0, zeroes = 0;
        for (char a : arr) {
            if (a == '1')
                ones++;
            else
                zeroes++;
        }
        // System.out.println("ones zero" + ones +" "+zeroes);
        return ones == zeroes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String in = sc.next();
        sc.close();
        char s[] = in.toCharArray();
        int i = 0;
        int zeroes = 0;
        for (char a : s) {
            if (a == '0')
                zeroes++;
        }

        if (zeroes == 0 || zeroes == n) {
            System.out.println(1);
            System.out.println(s);
        } else {
            for (i = 0; i < n - 1; i++) {
                // System.out.println(in.substring(0,i+1) + " " + in.substring(i+1, n));
                if (!isEqual(in.substring(0, i + 1).toCharArray()) && !isEqual(in.substring(i + 1, n).toCharArray())) {
                    break;
                }
            }
            if (i == n - 1)
                System.out.println(1);
            else
                System.out.println(2);
            System.out.println(in.substring(0, i + 1) + " " + in.substring(i + 1, n));
        }
    }
}