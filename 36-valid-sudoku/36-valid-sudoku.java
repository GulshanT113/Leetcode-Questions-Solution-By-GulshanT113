class Solution {
    public boolean ValidSudoku(int[][] arr, int i, int j, int x)
    {
        //Row wale elements check honge
        for(int k = 0; k < 9; k++){
            if(arr[k][j] == x && k != i)
                return false;
        }
        //Column wale elements check honge
        for(int k = 0; k < 9; k++){
            if(arr[i][k] == x && k != j)
                return false;
        }
        //Grid wale elements check honge
        int a = (i / 3) * 3;
        int b = (j / 3) * 3;
        for(int k = 0; k < 3; k++){
            for(int l = 0; l < 3; l++){
                if(arr[k+a][l+b] == x && (k+a) != i && (l+b) != j)
                    return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        int[][] arr = new int[9][9];
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.')
                    arr[i][j] = board[i][j] - '0';
            }
        }
        for(int i = 0; i < 9; i++){ // integer wale array m traversal shuru horaha h
            for(int j = 0; j < 9; j++){
                if(arr[i][j] != 0){
                    boolean ans = ValidSudoku(arr, i, j, arr[i][j]);
                    if(ans == false)
                        return false;
                }
            }
        }
        return true;
    }
}