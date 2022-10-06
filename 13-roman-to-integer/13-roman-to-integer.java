class Solution {
    public int romanToInt(String str) {
        int[] integerArr = { 1000, 500,  100,  50,  10,  5, 1 };
        char[] romanArr = {'M', 'D', 'C', 'L', 'X', 'V', 'I' };
        int ans = 0;
        int temp = 0;
        for(int i = str.length()-1; i >= 0; i--){
            char ch = str.charAt(i);
            for(int j = 0; j < romanArr.length; j++){
                if(ch == romanArr[j]){
                    int val = integerArr[j];
                    if (val >= temp) ans += val;
                    else ans -= val;
                    temp = val;
                } 
            }       
        }
        return ans;
    }
}