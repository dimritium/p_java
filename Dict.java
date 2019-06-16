import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class App2 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int m, n;
		m = sc.nextInt();
		n = sc.nextInt();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String mag_s, note_s;
        br.readLine();
        mag_s = br.readLine();
		note_s = br.readLine();
		String mag[] = mag_s.split(" ");
		String note[] = note_s.split(" ");
		Map<String, Integer> dict = new HashMap<String, Integer>();
		for(String s : mag) {
			if(!dict.containsKey(s))
				dict.put(s, 1);
			else
				dict.put(s, dict.get(s)+1);
		}
		int flag = 1;
		for(String s : note) {
			if(!dict.containsKey(s) || dict.get(s) == 0) {
				flag = 0;
				break;
			}
			else {
				dict.put(s, dict.get(s)-1);
			}
		}
//		System.out.println(dict);
		if(flag == 1)
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();
	}
}
