class Solution {      
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i : nums) hm.put(i, hm.getOrDefault(i, 0) + 1);
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i : hm.keySet()) pq.add(new Pair(i, hm.get(i)));  // khud ke dum per kiya ab yeh question.
        while(pq.size() > k) pq.remove();
        int ans[] = new int[k], idx = 0;
        while(!pq.isEmpty()){
            Pair pair_holder = pq.remove();
            ans[idx++] = pair_holder.key;
        }
        return ans;
    }
    class Pair implements Comparable<Pair>{
        int key, val;
        Pair(int key, int val){
            this.key = key;
            this.val = val;
        }
        public int compareTo(Pair other){
            return this.val-other.val;
        }
    }
}