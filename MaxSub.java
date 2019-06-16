import java.util.*;

class MaxSub {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    int curr_max = 1;
    int result = 1;
    for(int i = 0; i < n-1; i++) {
        if(arr[i] <= arr[i+1]) {
            curr_max++;
            if(curr_max > result) 
                result = curr_max;
        } else {
            curr_max = 1;
        }
    }
    System.out.println(result);
    }
}
  
  
