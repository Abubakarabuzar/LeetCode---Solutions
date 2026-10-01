
class Solution {
    public int[][] transpose(int[][] matrix) {

      int [][] newm=new int[matrix[0].length][matrix.length];
      for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            newm[j][i]=matrix[i][j];
        }
      }
      return newm;









        // int row = matrix.length;
        // int col = matrix[0].length;

        // int ans[][] = new int[col][row];

        // for (int i = 0; i < row; i++) {

        //     for (int j = 0; j < col; j++) {

        //         ans[j][i] = matrix[i][j];
        //     }
        // }

        // return ans;
    }
}