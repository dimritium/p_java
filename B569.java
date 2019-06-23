import java.util.*;

public class B569 {
    static int findMinPos(int arr[]) {
        int arr_n[] = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr_n);
        int i = 0;
        while(arr_n[i] < 0){
            i++;
        }
        return arr_n[i];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int pos = 0, neg = 0, zer = 0;
        int min_neg = 0;
        int min_pos = 100000007;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] < 0) {
                neg++;
                if(arr[i] < min_neg) {
                    min_neg = arr[i];
                }
            }
            else {//if (arr[i] > 0){
                pos++;
                if(arr[i] < min_pos) {
                    min_pos = arr[i];
                }
                if(arr[i] == 0)
                    zer++;
            }
            // else {
            //     zer++;
            // }
        }
        if(zer == n) {
            // System.out.println("d");
            if(zer%2 == 0) {
                for(int i = 0; i < n; i++) {
                    arr[i] = -arr[i] - 1;
                }
            }
        }

        else {
        if(neg == n) {
            if(neg%2 == 1) {
                for(int i = 0; i < n; i++) {
                    if(arr[i] == min_neg) {
                        arr[i] = -arr[i] - 1;
                        break;
                    }
                }
            }
        }
        else if((neg + pos) % 2 == 0) {
            for(int i = 0; i < n; i++) {
                if(arr[i] >= 0) {
                    arr[i] = -arr[i] -1;
                }
            }
        }
        else if( (neg+pos)%2 == 1) {
            // int min_pos_no = findMinPos(arr);
            int flag = 0;
            for(int i = 0; i < n; i++) {
                if(arr[i] >= 0) {
                    if(arr[i] == min_pos && flag == 0) {
                        flag = 1;
                        continue;
                    }
                    arr[i] = -arr[i] - 1;
                }
            }
        }
    }
    // System.out.println(Arrays.toString(arr).replace('[', ''));
    for(int i : arr)
        System.out.print(i + " ");
    }
}