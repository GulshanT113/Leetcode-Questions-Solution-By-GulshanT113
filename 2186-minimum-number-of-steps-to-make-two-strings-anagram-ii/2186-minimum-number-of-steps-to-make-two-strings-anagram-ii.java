class Solution {
    public int minSteps(String s, String t) {
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        int count = 0;
        for(int i = 0; i < s.length(); i++) 
            f1[s.charAt(i)-'a']++;
        for(int i = 0; i < t.length(); i++) 
            f2[t.charAt(i)-'a']++;
        for(int i = 0; i < 26; i++) 
            count += Math.abs(f1[i]-f2[i]);
        return count;
    }
}