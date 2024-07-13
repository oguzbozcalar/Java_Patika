import java.util.Arrays;

public class MatrixTranspose {
    public static void main(String[] args) {

        int[][] matrix = {{2, 3, 4}, {5, 6, 4}};
        int [][] transposeM = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                transposeM[i][j] = matrix[j][i];
            }
        }

        for (int i = 0; i < transposeM.length; i++) {
            for (int j = 0; j < transposeM[0].length; j++) {
                System.out.print(transposeM[i][j] + " ");
            }
            System.out.println();
        }



    }
}
