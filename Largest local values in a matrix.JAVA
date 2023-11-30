class Solution {
    int [][] grid;
    public int[][] largestLocal(int[][] grid) {
        this.grid = grid;
        int row = grid.length - 2;
        int col = grid.length - 2;
        int [][] res = new int [row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                res[i][j] = maximum(i,j);
            }
        }
        return res;
    }
    public int maximum(int a, int b){
        int max = 0;
        int row = a + 3;
        int col = b + 3;
        for(int i = a; i < row; i++){
            for(int j = b; j < col; j++){
                if(grid[i][j] > max){
                    max = grid[i][j];
                }
            }
        }
        return max;
    }
}
