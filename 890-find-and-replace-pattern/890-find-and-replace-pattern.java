class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        for(String str : words) {
            if(isIsomorphic(str, pattern)) ans.add(str);
        }
        return ans;
    }
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character, Character> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(hm.containsKey(a)){
                if(b != hm.get(a))
                    return false;
            }
            else{
                if(hm.containsValue(b)) return false;
                hm.put(a, b);
            }
        }    
        return true;
    }
}