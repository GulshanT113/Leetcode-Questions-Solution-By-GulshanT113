class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i : nums) sum += i;
        // System.out.println(sum);
        int left = 0, right = sum - nums[0];
        int i = 1;
        while(left != right && i < nums.length){
            left += nums[i-1];
            right -= nums[i];
            i++;
        }
        return left == right ? i-1 : -1;
    }
}