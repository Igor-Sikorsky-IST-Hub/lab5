public class Task1 {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 5, 8},
                {7, 2, 4},
                {9, 6, 1}
        };
        printResults(matrix);
    }

    public static void lolSwap(int[][] matrix) {
        if (matrix == null || matrix.length < 2) {
            throw new IllegalArgumentException("Matrix must have at least 2 rows.");
        }
        int[] temp = matrix[0];
        matrix[0] = matrix[matrix.length - 1];
        matrix[matrix.length - 1] = temp;
    }

    static void printResults(int[][] matrix) {
        try {
            lolSwap(matrix);
            for (int[] row : matrix) {
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


