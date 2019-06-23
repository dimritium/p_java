import java.util.*;

public class B295 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int res = 0;
        while(m != n) {
            if(m > n) {
                if(m%2 == 0)
                    m = m/2;
                else
                    m = m + 1;
                res++;
            }
            else {
                res += n-m;
                m = n;
            }
        }   
        System.out.println(res);
    }
}