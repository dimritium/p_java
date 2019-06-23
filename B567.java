import java.math.BigInteger;
import java.util.*;

public class B567 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        String s = sc.next();
        sc.close();
        char arr[] = s.toCharArray();
        int mid1 = (l%2)==0 ? l/2 : l/2+1;
        while(arr[mid1] == '0' && mid1 < l-1)
            mid1++;
        int mid2 = mid1-1;
        while(arr[mid2] == '0' && mid2 > 1)
            mid2--;
        
        BigInteger res = new BigInteger(s.substring(0, mid1)).add(new BigInteger(s.substring(mid1, l)));

        BigInteger res2 = new BigInteger(s.substring(mid2, l)).add(new BigInteger(s.substring(0, mid2)));

        if(arr[mid2] == '0') {
            System.out.println(res);
        }
        else if(arr[mid1] == '0') {
            System.out.println(res2);
        }
        else
            System.out.println(res.min(res2));
    }
}