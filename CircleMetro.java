import java.util.*;

class CircleMetro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = sc.nextInt(), x = sc.nextInt(), b = sc.nextInt(), y = sc.nextInt();
        int flag = 0;
        while (a != x && b != y) {
            // System.out.println("a" + a + " " + b);
            if (a == b) {
                flag = 1;
                break;
            }
            a = (a + 1) % n;
            if (a == 0)
                a = n;
            b = (b - 1) % n;

            if (b == 0)
                b = n;
            
            if(a == b) {
                flag = 1;
                break;
            }
        }
        if(flag == 1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}