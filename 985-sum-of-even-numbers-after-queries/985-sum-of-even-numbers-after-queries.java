class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] qry) {
        int n = qry.length, sum = 0;
        for(int i : nums) {
            if(i % 2 == 0)
                sum += i;
        }
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            int val = qry[i][0], idx = qry[i][1];
            if(nums[idx] % 2 == 0) sum -= nums[idx];
            nums[idx] += val;
            if(nums[idx] % 2 == 0) sum += nums[idx];
            ans[i] = sum;
        }
        return ans;
    }   
}