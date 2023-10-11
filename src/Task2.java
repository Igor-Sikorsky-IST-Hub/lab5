public class Task2 {
    public static void main(String[] args) {
        int[][] matrixA = {
                {3, 5, 8},
                {7, 2, 4},
                {9, 6, 1}
        };
        int[][] matrixB = {
                 {2, 7, 5},
                 {8, 3, 6},
                 {1, 4, 7}
        };
        printResults(matrixA,matrixB);
    }

    public static int[][] multiply(int[][] a, int[][] b){
        if (a == null || b == null || a.length == 0 || b.length == 0 || a [0].length != b.length) {
            throw new IllegalArgumentException("Invalid input matrices.");
        }
        int rowsA = a.length;
        int colsA = a [0].length;
        int colsB = b [0].length;
        int [][] result = new int [rowsA][colsB];
        for (int i = 0; i < rowsA; i++){
            for (int j = 0; j < colsB; j++){
                int sum = 0;
                for (int c = 0; c < colsA; c++){
                    sum += a[i][c] * b[c][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }
    static void printResults(int[][] matrixA,int[][] matrixB){
        try {
            int [][] result = multiply(matrixA, matrixB);
            for (int[] row : result) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        } catch (IllegalArgumentException a) {
            System.out.println("EXCEPTION! " + a.getMessage());
        }
    }
}