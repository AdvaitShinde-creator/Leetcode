class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;

        int count = 0;
        
        for(int i = 0; i < row ; i++){
            for(int j = 0; j < column ; j++){
                int maxC = Integer.MIN_VALUE;
                int maxR = Integer.MIN_VALUE;
                int x = 0;
                int y = 0;
                while(y < column){
                    if(grid[i][y] > maxR){
                        maxR = grid[i][y];
                    }
                    y++;
                }
                while(x < row){
                    if(grid[x][j] > maxC){
                        maxC = grid[x][j];
                    }
                    x++;
                }
                while(grid[i][j] != Math.min(maxC,maxR)){
                    grid[i][j]++;
                    count++;
                }
            }
        }
        return count;
    }
}