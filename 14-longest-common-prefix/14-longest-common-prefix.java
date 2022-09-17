class Solution {
    public String longestCommonPrefix(String[] strs) {
        for(int i = 0; i < strs[0].length(); i++){ // i is used to point to the letters
            char c = strs[0].charAt(i); // the fist word's letter are chosen
            for (int j = 1; j < strs.length; j ++) {  // j is used to transverse the 2nd and 3rd words
                if(i == strs[j].length() || c != strs[j].charAt(i)) // the concurrent letters of each words are searched.if the are equal,i++ and next letter of the words are checked for equality
                    return strs[0].substring(0,i); // when the letters doesnt match,it means the letters till i is the ans,so substring is returned.
            }
        }return strs[0]; // if all the words are equal,the first string is returned
    }
}