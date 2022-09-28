class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            if (check(word, pattern)) res.add(word);
        }
        return res;
    }
    
    boolean check(String word, String pattern) {
        for (int i = 0; i < word.length(); i++) {
            int idx_word = 0, idx_pattern = 0;
            char ch = word.charAt(i);
            char sh = pattern.charAt(i);
            
            for(int j = 0; j < word.length(); j++){// check the index of ch in word string
                char target = word.charAt(j);
                if(target == ch){
                    idx_word = j;
                    break;
                }
            }
            
             for(int k = 0; k < pattern.length(); k++){ // check the index of sh in pattern string
                char target2 = pattern.charAt(k);
                if(target2 == sh){
                    idx_pattern = k;
                    break;
                }
            }
            
            if(idx_word != idx_pattern) return false;
        }
        return true;
    }
}