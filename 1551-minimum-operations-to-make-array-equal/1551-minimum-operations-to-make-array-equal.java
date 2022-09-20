class Solution {
    public int minOperations(int n) {
        int s = 1, e = 2 * (n - 1) + 1, res = 0, mid = s + (e - s)/2;
        for(int i = e ; i >= mid; i = i-2) res = res + (i - mid);
        return res;
    }
}