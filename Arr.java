import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[2*n], flag = 0;
        for(int i = 0; i < 2*n; i++) {
            arr[i] = sc.nextInt();
        }
        // int flag = 0;
        for(int i = 0; i < 2*n - 1; i++) {
            if(arr[i] != arr[i+1]) {
                flag = 1;
                break;
            }
        }
        if(flag == 1) {
            System.out.println(String.join("", Arrays.stream(arr).sorted().mapToObj(String::valueOf).collect(Collectors.joining(" "))));
        } else {
            System.out.println("-1");
        }

    }
}