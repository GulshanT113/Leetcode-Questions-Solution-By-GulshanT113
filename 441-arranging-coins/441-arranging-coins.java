class Solution {
    public int arrangeCoins(int n) {
        // int c = 0, sum = 0;
        // for(int i = 1; i <= n; i++){
        //     sum += i;
        //     c++;
        //     if(sum > n)
        //         return c; 
        // }
        // return 0;
        int count = 0;
        while(n >= 0){
            n -= (count + 1);
            count++;
        }
        return count - 1;
    }
}