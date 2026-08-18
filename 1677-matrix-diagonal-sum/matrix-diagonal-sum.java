class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int matLen = mat.length;
        //even matrix
        for(int i=0; i<matLen; i++){
            //diagonal left––>Right
          sum += mat[i][i];
          //diagonal Right––>Left
          sum += mat[matLen-1-i][i];
            }

        //odd matrix
        if(matLen%2 != 0){
            sum -= mat[matLen/2][matLen/2];
        }

        return sum;
    }
}