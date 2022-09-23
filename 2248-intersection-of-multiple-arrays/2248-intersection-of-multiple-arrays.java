class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] freq = new int[1001];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++)
                freq[nums[i][j]]++;
        }
        List<Integer> al = new ArrayList<>();
        for(int i = 0; i < 1001; i++){
            if(freq[i] == nums.length)
                al.add(i);
        }
        return al;
    }
}