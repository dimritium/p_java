import java.util.*;

public class Lock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), result = 0;
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        for(int i = 0; i < n; i++) {
            result += Math.min(Math.abs(a[i]-b[i]), Math.abs(Math.abs(a[i]-b[i])-10)); 
        }
        System.out.println(result);
    }
}