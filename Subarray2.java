package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Subarray2 {
    public boolean checkSubarraySum(int[] nums, int k) {
        // Initialize a map to store cumulative sum modulo k and its corresponding index
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // Initialize with a dummy entry for cumulative sum 0

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = sum % k;

            if (map.containsKey(remainder)) {
                // Check if the subarray length is at least two
                if (i - map.get(remainder) >= 2) {
                    return true;
                }
            } else {
                map.put(remainder, i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Subarray2 solution = new Subarray2();
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;
        System.out.println(solution.checkSubarraySum(nums, k)); // Output: true
    }
}
