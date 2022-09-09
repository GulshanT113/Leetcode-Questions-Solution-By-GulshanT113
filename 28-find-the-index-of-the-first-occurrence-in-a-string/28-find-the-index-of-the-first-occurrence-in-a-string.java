class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0; // haystack
        while(i < haystack.length()){
            if(haystack.charAt(i) == needle.charAt(0)){
                boolean isPresent = strisPresent(haystack,needle,i);
                if(isPresent){
                    return i;
                }
            }
            i++;
        }
        return -1;
    }
    public boolean strisPresent(String a,String b,int idx){
        int i = idx;
        int j = 0;
        while(i < a.length() && j < b.length()){
            if(a.charAt(i) != b.charAt(j)){
                return false;
            }
            i++;
            j++;
        }
        return j == b.length();
    }
}