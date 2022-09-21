class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>(); // creating a HashMap.
        int ans = 0;
        for(int i : nums) 
            map.put(i, true); // we simply put the nums value in HashMap.
        for(int i : nums){
            if(map.containsKey(i-1)) map.replace(i, false); // this statement will work till i-- is present and replace ture with false and i is as it is.
        }
        for(int i : nums){
            if(map.get(i)){ // this statement will work on true conditon.
                int c = 1;
                while(map.containsKey(i+c)) c++; // this statement will work till i++ is present.
                if(ans < c) // this statement will work only that time c is greater then answer.
                    ans = c;
            }
        }
        return ans;
    }
}