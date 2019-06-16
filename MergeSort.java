import java.util.*;

class MergeSort {

    public static void mergeSort(int[] arr, int left, int right) {
        System.out.println("Inside MS "+"left: "+left+" right: "+right);
        if(right > left){
            int mid = (left+right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int arr[], int left, int mid, int right) {
        System.out.println("Inside Merge "+"left: "+left+" mid: "+mid+"  right: "+right);
        
        int leftStart = left, rightStart = mid + 1;
        
        int tempArr[] = new int[right-left+1], k =0;
        
        for(int i = left; i <= right; i++) {
            if(leftStart > mid)
                tempArr[k++] = arr[rightStart++];
            else if(rightStart > right)
                tempArr[k++] = arr[leftStart++];
            else if(arr[leftStart] < arr[rightStart] )
                tempArr[k++] = arr[leftStart++];
            else
                tempArr[k++] = arr[rightStart++];
        }
        for(int i = 0; i < k; i++)
            arr[left++] = tempArr[i];

    }
    public static void main(String[] args) {
        int arr[] = {1,5,0,2};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}