import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] twoSum(int[] nums, int target) {  
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        
        for(int i = 0; i < nums.length; i++) {
            int compl = target - nums[i];
            if(map.containsKey(compl) && map.get(compl) != i) {
                return new int[] {i, map.get(compl)};
            }
        }
        
        throw new IllegalArgumentException("No solution");
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Solution x = new Solution();
        int[] res = x.twoSum(new int[] {1, 7, 7, 15}, 14);
        System.out.println(String.format("%d %d", res[0], res[1]));
        System.out.println(System.currentTimeMillis() - start);

    }
}