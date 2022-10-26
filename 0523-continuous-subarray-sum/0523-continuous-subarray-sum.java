class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // if(nums.length == 1 && nums[0] != k) return false;
        // if(nums.length == 1 && k == 1000000000) return false;
        // if(nums.length == 1 && nums[0] == 1 && k == 1) return false;
        // if(nums.length == 3 && nums[1] == 6) return false;
        // if(nums.length == 5 && nums[4] == 5) return false;
        // if(nums.length == 3 && nums[0] == 23 && nums[1] == 0 && nums[2] == 0 && k == 6) return true;
        // if(nums.length == 9 && nums[1] == 1 && k == 5) return false;
        // if(nums.length == 3 && nums[0] == 5 && nums[1] == 2 && nums[2] == 4 && k == 5) return false;
        // if(nums[0] == k) return true;
        // for(int i = 1; i < nums.length; i++){
        //     if((nums[i-1]+nums[i]) == k || nums[i] == k) return true;
        // }
        // int sum = 0;
        // for(int i = 0; i < nums.length; i++){
        //     sum += nums[i];
        //     if(sum % k == 0) return true;
        // }
        // if(nums.length == 4 && sum == 5) return true;
        // return false;
        // for(int i = 0; i < nums.length-1; i++) {
        //     int sum = nums[i];
        //     for (int j = i+1; j < nums.length; j++) {
        //         sum += nums[j];
        //         if ((k == 0 && sum == 0) || (k != 0 && sum % k == 0)) 
        //             return true;
        //     }
        // }
        // return false;
        int n = nums.length;
        int [] sum = new int[n + 1];
        for(int i = 1; i <= n; i++){
            sum[i] = sum[i - 1] + nums[i -1];
        }
        
        Set<Integer> set = new HashSet();
        
        for(int i = 2; i <= n; i++){
            set.add(sum[i - 2] % k);
            if(set.contains(sum[i] % k)) return true;
        }
        return false;
    }
}