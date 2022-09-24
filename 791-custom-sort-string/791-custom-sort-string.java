class Solution {
    public String customSortString(String order, String s) {
        String s1 = "";
        String s2 = "";
        int[] freq = new int[26];
        for(char ch : order.toCharArray()) freq[ch-'a']++;
        for(char ch : s.toCharArray()) {
            if(freq[ch-'a'] == 0) s2 += ch;
            else freq[ch-'a']++;
        }
        for(char ch : order.toCharArray()){
            while(freq[ch-'a'] > 1){
                s1 += ch;
                freq[ch-'a']--;
            }
        }
        return s1+s2;
    }
}