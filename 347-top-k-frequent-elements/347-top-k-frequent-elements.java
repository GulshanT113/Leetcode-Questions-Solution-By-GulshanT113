class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i : nums)  hm.put(i, hm.getOrDefault(i, 0) + 1);
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int key : hm.keySet()) pq.add(new Pair(key, hm.get(key)));
        while(pq.size() > k) pq.remove();
        int arr[] = new int[pq.size()], idx = 0;
        while(!pq.isEmpty()){
            Pair remove = pq.remove();
            arr[idx++] = remove.key;
        }
        return arr;
    }
    class Pair implements Comparable<Pair>{
        int key;
        int val;
        Pair(int key, int val){
            this.key = key;
            this.val = val;
        }
        @Override
        public int compareTo(Pair other){
            // if(this.len == other.len){
            //     return this.idx - other.idx;
            // }
            return this.val - other.val;
        }
    }
}