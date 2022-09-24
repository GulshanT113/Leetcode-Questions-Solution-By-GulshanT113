class Solution {
    public String customSortString(String order, String s) {
        String s1 = "";
        String s2 = "";
        int[] freq = new int[26];// we declear the 26 size array for storing the charactors freq's.
        for(char ch : order.toCharArray()) freq[ch-'a']++; // we store the order string freq here.
        for(char ch : s.toCharArray()) {
            if(freq[ch-'a'] == 0) s2 += ch; //we store in s2 only that perticuler charactor that not persent in order string.  
            else freq[ch-'a']++; // and in this statement we store the freq of s string in freq array.
        }
        for(char ch : order.toCharArray()){
            while(freq[ch-'a'] > 1){ // we check here if freq is greater then 1 then we store the char in s1 string with respect to freq untill the freq equal to 1.
                s1 += ch;
                freq[ch-'a']--; // in this conditon we decrease the freq one by one after adding the one char in s1 string and one time we hit the while terminated condition with this process.
            }
        }
        return s1+s2;
    }
}