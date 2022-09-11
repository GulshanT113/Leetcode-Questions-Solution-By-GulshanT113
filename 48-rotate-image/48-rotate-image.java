class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse_column(matrix);
    }
    public int[][] transpose(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = i+1; j < matrix[i].length; j++){
                swap_2D(matrix, i, j, j, i);
            }
        }
        return matrix;
    }
    public void swap_2D(int[][] arr, int i_1, int j_1, int i_2, int j_2){
        int tamp = arr[i_1][j_1];
        arr[i_1][j_1] = arr[i_2][j_2];
        arr[i_2][j_2] = tamp;
    }
    public int[][] reverse_column(int[][] matrix){
        int n = matrix.length, m = matrix[0].length;
        int i = 0, j = m-1;
        while(i < j){
            swap_column(matrix, i++, j--);
        }
        return matrix;
    }
    public void swap_column(int[][] arr, int c_1, int c_2){
        for(int i = 0; i < arr.length; i++){
            swap_2D(arr, i, c_1, i, c_2);
        }
    }
}