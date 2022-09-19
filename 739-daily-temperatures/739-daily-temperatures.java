class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                ans[st.peek()] = i-st.peek();
                st.pop();
            }
            st.push(i);
        }
        return ans;
    }
}