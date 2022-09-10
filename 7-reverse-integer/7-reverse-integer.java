class Solution {
    public int reverse(int x) {
        boolean neg = (x < 0) ? true : false;
        if(x < 0) x = -x;
        int ans = 0;
        while(x > 0){
            int r = x % 10;
            int temp = ans * 10 + r;
            if((temp - r) / 10 != ans) return 0;
            ans = temp;
            x = x / 10;
        }
        if(neg) ans = -ans;
        return ans;
    }
}