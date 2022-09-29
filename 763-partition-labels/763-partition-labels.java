class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] freq = new int[26];
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) freq[s.charAt(i)-'a'] = i;
        int max = 0, temp = -1;
        for(int i = 0; i < s.length(); i++){
            max = Math.max(max, freq[s.charAt(i)-'a']);
            if(max == i){
                ans.add(max-temp);
                temp = max;
            }
        }
        return ans;
    }
}