import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class B427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, t, c, res = 0;
        n = sc.nextInt();
        t = sc.nextInt();
        c = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> defects = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] > t)
                defects.add(i);
        }
        // System.out.println(defects);

        if (defects.size() == 0) {
            res = n - c + 1;
        } else {
            if (defects.get(defects.size() - 1) != n - 1) {
                defects.add(n);
            }

            int prev = 0;
            for (int i = 0; i < defects.size(); i++) {
                int curr = defects.get(i) - prev;
                if (curr >= c)
                    res += curr - c + 1;
                prev = defects.get(i) + 1;
            }
        }
        System.out.println(res);
    }

}
