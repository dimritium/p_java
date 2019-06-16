import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class CountTriplets {
    static long comb(long i) {
        return (long) ((i * (i - 1) * (i - 2)) / 6);
    }

    static void createDict(long arr[], Map<Long, Long> dict) {
        for (int i = 0; i < arr.length; i++) {
            if (dict.containsKey(arr[i])) {
                long val = dict.get(arr[i]) + 1;
                dict.put(arr[i], val);
            } else {
                dict.put(arr[i], (long)1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Long, Long> dict = new HashMap<>();
        Map<Long, Long> lookingForToHowMany = new HashMap<>();
        createDict(arr, dict);
        long count_triplets = 0;
        if (r == 1) {
            for (long i : dict.keySet()) {
                if (dict.get(i) > 2)
                    count_triplets += comb(dict.get(i));
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                 // check if current is one to look for
                 if (lookingForToHowMany.containsKey(arr[i])) {
                    if (dict.get(arr[i] * r) > 0) {
                        /*
                         * count triplets based on how many were looking for the current number and how
                         * many arr[i]*r( or next series number) are present
                         */
                        count_triplets += (long) dict.get(arr[i] * r) * lookingForToHowMany.get(arr[i]);
                    }
                }
                
                // get triplets list
                if (dict.containsKey(arr[i] * r) && dict.containsKey(arr[i] * r * r)) {
                        if (lookingForToHowMany.get(arr[i] * r) != null) {
                            lookingForToHowMany.put(arr[i] * r, dict.get(arr[i] * r) + 1);
                        } else
                            lookingForToHowMany.put(arr[i] * r, (long)1);
                }
               
                // update dictionary
                long update_dict = dict.get(arr[i]) - 1;
                dict.put(arr[i], update_dict);
            }
        }
        System.out.println((long)count_triplets);
    }
}