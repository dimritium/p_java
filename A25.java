import java.util.*;

public class A25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0, odd = 0, evenc = 0, oddc = 0;
        for(int i = 0; i<n; i++) {
            int a = sc.nextInt();
            if(a%2 == 0) {
                even = i;
                evenc++;
            } else {
                odd = i;
                oddc++;
            }
        }
        if(oddc == 1) {
            System.out.println(odd+1);
        } else {
            System.out.println(even+1);
        }
    }
}