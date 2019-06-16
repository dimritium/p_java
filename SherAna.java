import java.util.Scanner;

class SherAna {
    static boolean comp_ana(String a, String b) {
        int a_arr[] = new int[26];
        int b_arr[] = new int[26];
        
        for(int i = 0; i < a.length(); i++) {
            a_arr[a.charAt(i)-'a']++;
            b_arr[b.charAt(i)-'a']++;
        }

        for(int i = 0; i < 26; i++) {
            if(a_arr[i] != b_arr[i]) 
                return false;
        }
        return true;
    } 
    
    static int ana(String s) {
        int anagrams = 0;

        for(int len = 1; len < s.length(); len++) {
            for(int j = 0; j <= s.length()-len; j++) {
                String comp = s.substring(j, j+len);
                for(int k = j+1; k <= s.length()-len; k++) {
                    if(comp_ana(comp, s.substring(k,k+len))) {
                        anagrams++;
                    }
                }
            }
        }

        return anagrams;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println((long)100000*99999*99998/6);
        int q = sc.nextInt();
        while(q-- > 0) {
            String s = sc.next();
            System.out.println(ana(s));
        }
    }
}