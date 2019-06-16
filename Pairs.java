import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javafx.util.Pair;

public class Pairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		List<Pair<Integer, Integer>> values = new ArrayList<Pair<Integer, Integer>>();
		while (m-- > 0) {
			values.add(new Pair<Integer, Integer>(sc.nextInt(), sc.nextInt()));
		}
		int arr_val[] = { values.get(0).getKey(), values.get(0).getValue() };
    
		sc.close();
		for (int val : arr_val) {
      int val_count[] = new int[n+1];
			int all = 0;
			for (Pair<Integer, Integer> pair : values) {
				if (pair.getKey() != val && pair.getValue() != val) {
					val_count[pair.getKey()]++;
					val_count[pair.getValue()]++;
					all++;
				}
			}
			int max = Arrays.stream(val_count).max().getAsInt();
			if (max == all) {
				System.out.println("YES\n");
				return;
			}
		}
		System.out.println("NO\n");
	}
}
