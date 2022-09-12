class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones) pq.add(i);
        while(pq.size() > 1){
            int a = pq.remove(), b = pq.remove();
            int ans = a-b;
            if(ans != 0) pq.add(ans);
        }
        return pq.isEmpty() ? 0 : pq.peek();
    }
}