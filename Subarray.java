package leetcode;
import java.util.HashMap;

class Subarray{
    public static void main(String[] args) {
        // Example usage
        Subarray subarray = new Subarray();
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;
        boolean hasGoodSubarray = subarray.checkSubarraySum(nums, k);

        System.out.println("Has a good subarray: " + hasGoodSubarray);
    }
    public boolean checkSubarraySum(int[]nums, int k){
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0,-1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
            if(map.containsKey(sum%k)){
                //check the size
                int index=map.get(sum%k);
                if(i-index>=2){
                    return true;
                }
                else{
                    map.put(sum%k,1);
                    //store the first occ;

                }
            }
        }
        return false;
    }
    public String hasGoodSubarray(int[] nums1, int k1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hasGoodSubarray'");
    }
}