class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int c = 0;
        for(int i = 0; i < pushed.length; i++){
            st.push(pushed[i]);
            while(!st.isEmpty() && st.peek() == popped[c]){
                st.pop();
                c++;
            }  
        }
        return c == popped.length;
    }
}