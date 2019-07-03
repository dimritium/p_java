import java.util.*;

public class B1187 {

    static void init(List<ArrayList<Integer>> arr, char s[]) {
        for(int i = 0; i<26; i++) {
            arr.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < s.length; i++) {
            arr.get(s[i] - 'a').add(i+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char s[] = sc.next().toCharArray();
        int m = sc.nextInt();
        List<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        init(arr, s);
        
        while(m-- > 0) {
            int res = 0;
            char cs[] = sc.next().toCharArray();
            int carr[] = new int[26];
            for(int  i = 0; i < cs.length; i++) {
                carr[cs[i] - 'a']++;
            }
            for(int i = 0; i < 26; i++) {
                if(carr[i] > 0) {
                    int index = arr.get(i).get(carr[i] - 1);
                    if(res < index) {
                        res = index;
                    }
                }
            }
            System.out.println(res);
        }
    }
}