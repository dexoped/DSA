class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid.length; j++){
                boolean diagonal = (i == j || i == n - 1 - j);
                if (diagonal && grid[i][j] == 0)
                       return false;

                if (!diagonal && grid[i][j] != 0)
                       return false;
            }
        }
        return true;
}
}