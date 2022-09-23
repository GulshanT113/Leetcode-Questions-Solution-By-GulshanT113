class Solution {
    public boolean judgeSquareSum(int c) {
        int root = (int) Math.sqrt(c);
        long a = 0, b = root;
        while(a <= b){
            long sum = (a*a)+(b*b);
            if(sum == c) return true;
            else if(sum > c) b--;
            else a++;
        }
        return false;
    }
}