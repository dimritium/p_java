import java.util.*;

public class zeroAOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ones = 0, zeroes = 0;
        String s = sc.next();
        char[] arr = s.toCharArray();
        for(int i = 0; i < n; i++) {
            if(arr[i] == '1') 
                ones++;
            else
                zeroes++;
        }
        System.out.println(n - Math.min(zeroes, ones)*2);
    }
}