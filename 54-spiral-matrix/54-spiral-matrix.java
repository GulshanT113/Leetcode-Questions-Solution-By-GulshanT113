
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        int sr = 0;
        int sc = 0;
        int er = matrix.length-1;
        int ec = matrix[0].length-1;
        // List<Integer> ans = new ArrayList<>();
        int tEle = matrix.length * matrix[0].length;
        int c = 0;
        while(c < tEle){
            for(int i = sc; i <= ec && c < tEle; i++ ){
                ans.add(matrix[sr][i]);
                c++;
            }
            sr++;
            for(int i = sr; i <= er  && c < tEle; i++ ){
                ans.add(matrix[i][ec]);
                c++;
            }
            ec--;
            for(int i = ec; i >= sc  && c < tEle; i--){
                ans.add(matrix[er][i]);
                c++;
            }
            er--;
            for(int i = er ; i >= sr && c < tEle; i--){
                ans.add(matrix[i][sc]);
                c++;
            }
            sc++;
        }
        return ans;
    }
}