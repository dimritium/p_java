import java.util.*;

class CC4203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        seive(1000000000);
    }

    private static void seive(int n) {
        boolean lis[] = new boolean[n+1];
        for(int i = 2; i < n; i++)
            lis[i] = true;
        
        for(int i = 2; i*i <= n; i++) {
            for(int j = i*i; j <= n; j+=i) {
                lis[j] = false;
            }
        }
        // for(int i = 0; i <n; i++)
        // System.out.println(lis[i]);
        // return lis;
    }
}