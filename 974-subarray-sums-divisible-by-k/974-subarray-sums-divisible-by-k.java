class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); 
        map.put(0,1);  // yeh kyo kiya smjh ni aya sir se puchunga.
        for(int i : nums){
            sum += i;
            int r = sum % k;
            if(r < 0) r += k;
            if(map.containsKey(r)) count += map.get(r);
            map.put(r, map.getOrDefault(r,0)+1);
        }
        return count;
    }
}