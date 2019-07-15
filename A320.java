import java.util.*;

public class A320 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer x = sc.nextInt();
        sc.close();
        String bin = Integer.toBinaryString(x);
        int res = 0;
        for (char a : bin.toCharArray()) {
            if(a == '1') {
                res++;
            }
        }
        System.out.println(res);
    }
}