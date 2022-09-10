class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int NGR[] = NGR(arr), n = arr.length;
        int[] ans = new int[n-k+1];
        int j = 0, idx = 0;
        for(int i = 0; i <= n-k; i++){
            if(j < i) j = i;
            while(NGR[j] < i+k) j = NGR[j];
            ans[idx++] = arr[j];
        }
        return ans;
    }
    public int[] NGR(int[] arr){
        int n = arr.length, ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]) st.pop();
            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return ans;
    }
}