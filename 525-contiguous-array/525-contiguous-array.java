class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        int ans = 0, sum = 0, n = nums.length;
        hm.put(0, -1); // we do this for even length of nums array.
        for(int i = 0; i < n; i++){
            if(nums[i] == 0) sum += -1;
            else if(nums[i] == 1) sum += 1;
            if(hm.containsKey(sum)){ // in this condition we calculate the answer here because sum is appear again.
                int idx = hm.get(sum);
                int l = i-idx; // idx is always smaller then i.
                if(l > ans) ans = l;
            }
            else hm.put(sum, i); // on this statemnet sum appear first time.
        }
        return ans;
    }
}

        // for(int i : nums){
        //     if(i == 0) i = -1;
        // }
        // int[] ans = new int[nums.length];
        // ans[0] = nums[0];
        // for(int i = 1; i < nums.length; i++)
        //     ans[i] = ans[i-1]+nums[i];
        // int max = 0, c = 0;
        // // for(int i = 0; i < ans.length-1; i++){
        // //     for(int j = i+1; j < ans.length; j++){
        // //         if(ans[i] != ans[j]) c++;
        // //         else max = Math.max(max, c);
        // //     }
        // // }