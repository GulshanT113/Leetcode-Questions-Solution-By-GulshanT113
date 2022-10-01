
class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int top = 0, right = arr[0].length-1, bottom = arr.length-1, left = 0, dir = 0;
        while(top <= bottom && left <= right){
            if(dir % 4 == 0){
                for(int i = left; i <= right; i++) ans.add(arr[top][i]);
                dir++;
                top++;
            }
            else if(dir % 4 == 1){
                for(int i = top; i <= bottom; i++) ans.add(arr[i][right]);
                dir++;
                right--;
            }
            else if(dir % 4 == 2){
                for(int i = right; i >= left; i--) ans.add(arr[bottom][i]);
                dir++;
                bottom--;
            }
            else if(dir % 4 == 3){
                for(int i = bottom; i >= top; i--) ans.add(arr[i][left]);
                dir++;
                left++;
            }
        }
        return ans;
    }
}