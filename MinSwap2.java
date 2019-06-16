import java.util.Scanner;

class MinSwap2 {
    static int minSwap(int arr[]) {
        int minSwaps = 0;
        int first = 0, last = arr.length - 1;

        while(first < last) {
            while(arr[first] == first + 1 && first < last)
                first ++;
            if(first < last) {
                int temp = arr[arr[first] - 1];
                arr[arr[first] - 1] = arr[first];
                arr[first] = temp;
                minSwaps++;
            }
        }
        return minSwaps;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int array[] = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(minSwap(array));
    }
}