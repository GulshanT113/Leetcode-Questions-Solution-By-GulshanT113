class Solution {
    public int[][] merge(int[][] intervals) {
        Stack<int[]> st = new Stack<>();
        Arrays.sort(intervals, (a, b) -> a[0]-b[0]);
        for(int[] arr : intervals){
            if(st.isEmpty()) 
                st.push(arr);
            else{
                if(arr[0] <= st.peek()[1])
                    st.peek()[1] = Math.max(st.peek()[1], arr[1]);
                else
                    st.push(arr);
            }
        }
        int ans[][] = new int[st.size()][2], idx = 0;
        for(int[] arr : st) ans[idx++] = arr;
        return ans;
    }
}