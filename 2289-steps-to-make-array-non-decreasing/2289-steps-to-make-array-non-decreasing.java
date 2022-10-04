class Solution {
    class Pair{
        int val;
        int ele;
        Pair(int val, int ele){
            this.val = val;
            this.ele = ele;
        }
    }
    public int totalSteps(int[] nums) {
        int n = nums.length;
        Stack<Pair> st = new Stack<>();
        int ans = 0;
        for(int i = n-1; i >= 0; i--){
            int steps = 0;
            while(st.size() > 0 && st.peek().val < nums[i]){
                steps = Math.max(steps + 1, st.peek().ele);
                st.pop();
            }
            ans = Math.max(ans,steps);
            st.push(new Pair(nums[i], steps));
        }
        return ans;
    }
}