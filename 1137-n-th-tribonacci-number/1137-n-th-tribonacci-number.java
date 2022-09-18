class Solution {
    HashMap<Integer, Integer> hm = new HashMap<>();
    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        if(hm.containsKey(n)) return hm.get(n);
        int f1 = tribonacci(n-1);
        int f2 = tribonacci(n-2);
        int f3 = tribonacci(n-3);
        hm.put(n, f1+f2+f3);
        return f1+f2+f3;
    }
}