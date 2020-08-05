class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for (x in 0..nums.count() - 1) {
            map.put(nums[x], x)
        }

        for ( x in 0..nums.count()) {
            if(map.containsKey(target - nums[x]) && x != map.get(target - nums[x])) {
                return intArrayOf(x, map.get(target - nums[x])!!)
            }
        }
        throw IllegalArgumentException("Value must be positive")
    }
}

fun main(args: Array<String>) {
    val startTime = System.currentTimeMillis()
    val sol = Solution()
    val res: IntArray = sol.twoSum(intArrayOf(1, 7, 7, 15), 14)
    println(String.format("%d %d", res[0], res[1]))
    println(System.currentTimeMillis() - startTime)
}