class Solution {
    public boolean checkIfPangram(String sentence) {
        int c = 0;
        for(char ch = 'a'; ch <= 'z'; ch++){
            for(int i = 0; i < sentence.length(); i++){
                if(sentence.charAt(i) == ch){
                    c++;
                    break;
                }
            }
        }
        if(c == 26) return true;
        else return false;
    }
}