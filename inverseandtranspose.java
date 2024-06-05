public class MatrixOperations {
    public static void main(String[] args) {
        double[][] matrix = { {1, 2, 3}, {0, 1, 4}, {5, 6, 0} };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        if (isSquare(matrix)) {
            double[][] transpose = transposeMatrix(matrix);
            System.out.println("Transpose of the Matrix:");
            printMatrix(transpose);

            if (hasInverse(matrix)) {
                double[][] inverse = findInverse(matrix);
                System.out.println("Inverse of the Matrix:");
                printMatrix(inverse);
            } else {
                System.out.println("The matrix does not have an inverse.");
            }
        } else {
            System.out.println("The matrix is not square, hence no inverse or transpose can be found.");
        }
    }

    public static boolean isSquare(double[][] matrix) {
        return matrix.length == matrix[0].length;
    }

    public static boolean hasInverse(double[][] matrix) {
        double determinant = determinant(matrix);
        return determinant != 0;
    }

    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transpose = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static double[][] findInverse(double[][] matrix) {
        int n = matrix.length;
        double[][] inverse = new double[n][n];
        double determinant = determinant(matrix);
        
        // Finding adjoint
        double[][] adjoint = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double[][] minor = minorMatrix(matrix, i, j);
                adjoint[i][j] = Math.pow(-1, i + j) * determinant(minor);
            }
        }
        
        // Inverse = adjoint / determinant
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inverse[i][j] = adjoint[i][j] / determinant;
            }
        }
        
        return inverse;
    }

    public static double determinant(double[][] matrix) {
        int n = matrix.length;
        if (n == 1) {
            return matrix[0][0];
        }
        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
        double det = 0;
        for (int j = 0; j < n; j++) {
            double[][] minor = minorMatrix(matrix, 0, j);
            det += Math.pow(-1, 0 + j) * matrix[0][j] * determinant(minor);
        }
        return det;
    }

    public static double[][] minorMatrix(double[][] matrix, int row, int col) {
        int n = matrix.length;
        double[][] minor = new double[n - 1][n - 1];
        for (int i = 
