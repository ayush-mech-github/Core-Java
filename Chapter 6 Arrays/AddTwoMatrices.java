public class AddTwoMatrices {
    public static void main(String[] args) {
        int[][] mat1 = { { 5, 6, 7 },
                { 9, 4, 3 } };
        int[][] mat2 = { { 1, 2, 3 },
                { 5, 6, 8 } };
        int[][] sum = {{0,0,0},
                         {0,0,0}};

        for (int i = 0; i < mat1.length; i++){
            for (int j = 0; j < mat1[i].length; j++) {
                    sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for (int i = 0; i < mat1.length; i++){
            for (int j = 0; j < mat1[i].length; j++) {
                    System.out.print(sum[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
