class Solution {
    public int diagonalSum(int[][] mat) {
        // int add=0;
        // for(int i=0;i<mat.length;i++){
        //     for(int j=0;j<mat[i].length;j++){
        //         if(i==j || i+j==mat.length-1){
        //             add+=mat[i][j];
        //         }
        //     }
        // }
        // return add;

        int i=0;
        int j=0;
        int sum=0;
        while(i<mat.length && j<mat[0].length){
            sum+=mat[i][j];
            i++;
            j++;

        }
        int k=0;
        int l=mat.length-1;
        while(k<mat.length && l>=0){
            if(k!=l){
sum+=mat[k][l];
            }
            
            k++;
            l--;
        }
        return sum;
        
    }
}