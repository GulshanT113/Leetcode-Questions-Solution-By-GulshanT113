class Solution {
    public int longestContinuousSubstring(String s) {
        int length = 1, ans = 0;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1) + 1) 
                length++;
            else{
                ans = ans > length ? ans : length;
                length = 1;
            }
        }
        return ans > length ? ans : length;
    }
}