class Solution {
    public String reverseOnlyLetters(String s) {
        char ch[] = s.toCharArray();
        int i = 0, j = s.length()-1;
        while(i <= j){
            if(isLtr(ch[i]) == false){
                i++;
                continue;
            }
            if(isLtr(ch[j]) == false){
                j--;
                continue;
            }
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++; j--;
        }
        String str = new String(ch);
        return str;
    }
    public boolean isLtr(char ch){
        for(int i = 'a'; i <= 'z'; i++){
            if(i == ch)
                return true;
        }
        for(int i = 'A'; i <= 'Z'; i++){
            if(i == ch)
                return true;
        }
        return false;
    }
}