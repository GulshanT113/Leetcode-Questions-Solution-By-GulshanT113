class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hm = new HashMap<>();
        for(String i : strs){
            char[] ch = i.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if(!hm.containsKey(s))
                hm.put(s, new ArrayList<>());
            hm.get(s).add(i); 
        }
        return new ArrayList<>(hm.values());
    }
}