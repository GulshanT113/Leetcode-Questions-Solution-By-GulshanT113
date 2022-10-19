class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        Set<Character> set = new HashSet<>();
        int max = 0;
        while(right < s.length()){
            char ch = s.charAt(right);
            if(set.add(ch)){
                max = Math.max(max, right-left+1);
                right++;
            }
            else{
                while(s.charAt(left) != ch){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}