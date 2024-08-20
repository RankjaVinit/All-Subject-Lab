public class MatrixMultiplication{
    public static void main(String[] args) {
        int [][] matrix1 = {{1 , 2},{1 , 2},{1 , 2}};
        int [][] matrix2 = {{1 , 1 , 1},{2 , 2 , 2}};

        int [][] ans = new int[3][3];

        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                for(int k = 0 ; k < 2 ; k++){
                    ans[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}