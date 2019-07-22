import java.util.*;
import static java.util.stream.Collectors.*;

public class A1195 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int drinks[] = new int[k+1];
        for(int i = 0; i < n; i++) {
            int drink = sc.nextInt();
            drinks[drink] += 1;
        }
        sc.close();
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();
        
        Arrays.sort(drinks);
        for(int i : drinks) {
            if (i%2 == 0)
                evens.add(i);
            else
                odds.add(i);
        }
        int sets = (int) Math.ceil(n/2.0);
        long res = 0;
        
        for(int i : evens) {
            if(sets > 0) {
                int temp = Math.min(i/2, sets);
                sets -= temp;
                res += Math.min(i, temp*2);
            }
        }
        Collections.sort(odds, Collections.reverseOrder());
        for(int i : odds) {
            if(sets > 0) {
                int temp = Math.min(i/2 + 1, sets);
                sets -= temp;
                res += Math.min(i, temp*2);
            }
        }
        
        System.out.println(res);
    }
}