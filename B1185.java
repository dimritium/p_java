import java.util.*;

public class B1185 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0) {
            char s[] = sc.next().toCharArray();
            char s2[] = sc.next().toCharArray();
            int len1 = 0, len2 = 0;
            for(len1 = 0, len2 = 0; len1 < s.length && len2 < s2.length; ) {
                if(s[len1] == s2[len2]) {
                    len1++; len2++;
                }
                else if (len1 > 0 && s[len1-1] == s2[len2]) {
                    while(len2 < s2.length && s2[len2] == s[len1-1] )
                        len2++;
                }
                else {
                    break;
                }
            }
            if(s2.length > len2 && len1 == s.length) {
                while(len2 < s2.length && s2[len2] == s[len1-1])
                    len2++;
            }
            if(len2 == s2.length && len1 == s.length && s[len1 - 1] == s2[len2 - 1]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}