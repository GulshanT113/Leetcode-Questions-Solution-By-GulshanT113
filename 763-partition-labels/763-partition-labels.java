class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++) hm.put(s.charAt(i), i);
        int currEnd = 0; //denotes the potential end of current partition
        int currStart = 0;
        List<Integer> ans = new ArrayList();
        while(currEnd < n){
            int i;
            for (i = currStart; i <= currEnd; i++){
                int newEnd = hm.get(s.charAt(i));
                currEnd = Math.max(currEnd, newEnd);
            }
            ans.add(currEnd - currStart + 1);
            currStart = i;
            currEnd = i;
        }
        return ans;
    }
}