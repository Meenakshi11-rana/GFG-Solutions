class Solution {
    void booleanMatrix(int mat[][]) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        boolean[] row=new boolean[n];
        // boolean[] col=new boolean[n];  //--n*m matrix
        boolean[] col=new boolean[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==true||col[j]==true){
                    mat[i][j]=1;
                }
            }
        }
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna