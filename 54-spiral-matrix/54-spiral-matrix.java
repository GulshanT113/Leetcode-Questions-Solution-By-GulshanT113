
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        int top = 0, bottom = matrix.length-1, left = 0, right = matrix[0].length-1, dir = 0;
        while(left <= right && top <= bottom){
            if(dir % 4 == 0){
                for(int i = left; i <= right; i++) ans.add(matrix[top][i]);
                dir++; top++;
            }
            else if(dir % 4 == 1){
                for(int i = top; i <= bottom; i++) ans.add(matrix[i][right]);
                dir++; right--;
            }
            else if(dir % 4 == 2){
                for(int i = right; i >= left; i--) ans.add(matrix[bottom][i]);
                dir++; bottom--;
            }
            else if(dir % 4 == 3){
                for(int i = bottom; i >= top; i--) ans.add(matrix[i][left]);
                dir++; left++;
            }
        }
        return ans;
    }
}