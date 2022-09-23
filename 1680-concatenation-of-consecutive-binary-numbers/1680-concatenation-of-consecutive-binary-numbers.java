class Solution {
    public int concatenatedBinary(int n) {
        long a = 0;
        int b = 2;
        for (int i = 1; i <= n; i++) {
            if (i >= b) b *= 2;
            a = (a * b + i) % 1000000007;
        }
        return (int)a;
    }
}