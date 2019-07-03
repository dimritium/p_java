import java.util.*;

public class A119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int max = 0;
        for(int n1 = 0; n - n1*a >=0; n1++) {
            for(int n2 = 0; n - n1*a - n2*b >= 0; n2++) {
                int d = n - n1*a - n2*b;
                if(d%c == 0 && n1 + n2 + d/c > max) 
                    max = n1 + n2 + d/c;
            }
        }
        System.out.println(max);
    }
}