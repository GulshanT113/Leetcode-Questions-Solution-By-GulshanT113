class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(selfdiv(i))
                res.add(i);
        }
        return res;
    }
    public boolean selfdiv(int n){
        int num = n;
        while(num > 0){
            int rem = num%10;
            num /= 10;
            if(rem == 0 || n % rem != 0)
                return false;
        }
        return true;
    }
}