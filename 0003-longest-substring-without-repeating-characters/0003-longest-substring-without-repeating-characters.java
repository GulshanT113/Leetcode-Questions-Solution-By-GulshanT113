class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0;
        Set<Character> valid = new HashSet(); // set can't allow duplicate characters.
        while(j < s.length()){
            if(valid.add(s.charAt(j))){
                max = Math.max(max, j-i+1);
                j++;
            }    
            else{
                while(s.charAt(i) != s.charAt(j)){
                    valid.remove(s.charAt(i));
                    i++;
                }  
                valid.remove(s.charAt(j));
                i++;    
            }
        }
        return max;
    }
}