class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String,Integer> map = new HashMap<>();
        int ans = 0;
        for(int i = 0; i < matrix.length; i++){
            int[] arr = new int[matrix[0].length];
            String curr = "", /*original row */ flip = ""; //after flip
            for(int j = 0; j < matrix[0].length; j++){
                curr += matrix[i][j];// original store here.
                flip += matrix[i][j] == 1 ? 0 : 1; //flipping    
            }
            map.put(curr, map.getOrDefault(curr, 0) + 1); // we store the freq of curr.
            map.put(flip, map.getOrDefault(flip, 0) + 1); // we store the freq of flip.
            
            ans = Math.max(ans, map.get(curr)); // we compare here curr data with ans stored data which one is maximum.
            ans = Math.max(ans, map.get(flip)); // we compare here flip data with ans stored data which one is maximum.
        }
        return ans; // finally we return the ans here.
    }
}