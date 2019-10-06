import java.util.*;

public class A1197 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int planks[] = new int[n];
            for(int i = 0; i < n; i++) {
                planks[i] = sc.nextInt();
            }
            Arrays.sort(planks);
            int i = n-2;
            boolean flag = false;
            if(n > 2) {
                for( ; i >= 0; i--) {
                    if(planks[n-1] > i && planks[n-2] > i) {
                        flag = true;
                        break;
                    }
                }
            }
            if(flag) {
                System.out.println((i));
            } else
            System.out.println(0);
        }
        sc.close();
    }
}