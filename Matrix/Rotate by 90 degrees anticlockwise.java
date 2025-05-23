/* Given a square matrix mat[][] of size n x n. The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space. 
 */

class Solution {
    // Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int mat[][]) {
        // code here
        int row=mat.length;
        int col=mat[0].length;
        
        //transposing the matrix
        for(int i=0; i<row; i++){
            for(int j=i; j<col; j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        
        //reversing each column
        for(int j=0; j<col; j++){
            for(int i=0; i<row/2; i++){
                int temp=mat[i][j];
                mat[i][j]=mat[row-1-i][j];
                mat[row-1-i][j]=temp;
            }
        }
    }
}
