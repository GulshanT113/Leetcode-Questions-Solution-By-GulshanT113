class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> hs = new HashSet<>(); // HashSet contains unique value.
        for(int i : nums) if(i != 0) hs.add(i);
        return hs.size();
    }
}