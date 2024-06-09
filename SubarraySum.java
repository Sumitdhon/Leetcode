package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SubarraySum {
    public static void main(String[] args) {
        // Example usage
        Subarray subarray = new Subarray();
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;
        boolean hasGoodSubarray = subarray.checkSubarraySum(nums, k);

        System.out.println("Has a good subarray: " + hasGoodSubarray);
    }
    public boolean hasGoodSubarray(int[] nums,int k){
        Map<Integer,Integer>map=new HashMap<>();
        //key: rolling sum%k,val: array index.
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            int mod=k==0? sum:sum%k;
            if(map.containsKey(mod) && i-map.get(mod)>1)
            return true;
            
        }
        return false;
    }
    
}
