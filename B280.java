import java.math.BigDecimal;
import java.util.*;

public class B280 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), l = sc.nextInt();
        // int arr[] = new int[n];
        BigDecimal arr[] = new BigDecimal[n];
        BigDecimal a = BigDecimal.ZERO;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextBigDecimal();
        }
        Arrays.sort(arr);
        BigDecimal init = arr[0].multiply(new BigDecimal("-1"));
        BigDecimal res = new BigDecimal("0");
        for(int i = 0; i < n; i++) {
            if(arr[i].subtract(init).divide(new BigDecimal(2)).compareTo(res) == 1) {
                res = arr[i].subtract(init).divide(new BigDecimal(2));
            }
            init = arr[i];
        }
        
        if(init.compareTo(new BigDecimal(l)) != 0 && new BigDecimal(l).subtract(init).compareTo(res) == 1) {
            res = new BigDecimal(l).subtract(init);
        }

        System.out.printf("%.9f",res);
    }
}