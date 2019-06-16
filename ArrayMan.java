import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

class ArrayMan {

    static void initArr(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
    
    static void runOps(int a, int b , int k, long arr_n[]) {
        arr_n[a] += k;
        if(b+1 <= arr_n.length-1)
            arr_n[b+1] -= k;
    }

    static long max(long arr[]) {
        long temp = 0, max = 0;
        for(int i = 1; i < arr.length; i++){
            temp += arr[i];
            if(temp > max)
                max = temp; 
        }
        return max;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
    
        long[] arr_n = new long[n+1];
        
        for(int i = 0; i < m; i++) {
            runOps(sc.nextInt(), sc.nextInt(), sc.nextInt(), arr_n);
        }
        
        System.out.print(max(arr_n));
    }
}