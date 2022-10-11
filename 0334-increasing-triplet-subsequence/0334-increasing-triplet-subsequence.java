class Solution {
    public boolean increasingTriplet(int[] nums) {
        // if(nums[0] == nums[nums.length-1]) return false;
        // for(int i = 1; i < nums.length-1; i++){
        //     if(nums[i] < nums[i-1] && nums[i] > nums[i+1]) return false;
        // }
        // return true;  // only 59 test case paas with this code out of 75.
        int m1 = Integer.MAX_VALUE;
        int m2 = Integer.MAX_VALUE;
        for(int i : nums){
            if(i <= m1) m1 = i;
            else if(i <= m2) m2 = i;
            else return true;
        }
        return false;
    }
}