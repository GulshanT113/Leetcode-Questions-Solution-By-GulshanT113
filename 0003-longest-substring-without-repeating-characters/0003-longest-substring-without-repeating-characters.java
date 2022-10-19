class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, max = 0;
        Set<Character> set = new HashSet<>();
        while(right < s.length()){
            if(set.add(s.charAt(right))){
                max = Math.max(max, right-left+1);
                right++;
            }
            else{
                while(s.charAt(left) != s.charAt(right)){
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