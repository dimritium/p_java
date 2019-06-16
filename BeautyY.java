import java.util.*;

class BeautyY {
    static boolean distinct(String s) {
        
        Set<Character> set = new HashSet<>();
        char arr[] = new char[s.length()];
        arr = s.toCharArray();
        for(char a : arr) {
            set.add(a);
        }
        if(set.size() == s.length()) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = n+1;
        while(!distinct(Integer.toString(result))) {
            result+=1;
        }
        Sstem.out.println(result);
    }
}
