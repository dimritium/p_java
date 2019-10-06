import java.util.*;

public class B284 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < m; i++) {
            String a, b;
            a = sc.next();
            b = sc.next();
            if(b.length() < a.length()) {
                map.put(a, b);
                map.put(b, b);
            } else {
                map.put(b, a);
                map.put(a, a);
            }
        }
        String words[] = new String[n];
        for(int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        for(String a : words) {
            System.out.print(map.get(a)+" ");
        }
        sc.close();
    }
}