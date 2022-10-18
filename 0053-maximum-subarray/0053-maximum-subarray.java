class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            max = Math.max(max, sum);
            if(sum < 0) sum = 0;
            // System.out.print(max + " ");
        }
        return max;
    }
}