class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0, j = n-1, max = 0, area, res;
        while(i < j){
            if(height[i] < height[j]){
                area = height[i] * (j-i);
                if(area > max)
                    max = area;
                i++;
            }
            else{
                area = height[j] * (j-i);
                if(area > max)
                    max = area;
                j--;
            }
        }
        return max;
    }
}