import java.util.*;

public class Stairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int min_steps = n/2 + n%2;

        if(m <= min_steps) {
            if(min_steps%m == 0){
                System.out.println(min_steps);
            } else
            System.out.println(min_steps + m - (min_steps % m));
        }
        else if( m > min_steps && m <= n) {
            System.out.println(m);
        } else {
            System.out.println("-1");
        }
    }
}