
public class Arrays {

    public static void main(String[] args) {

        // 1. One-Dimensional Array (1D)
        System.out.println("1. One-Dimensional Array:");
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("  Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("    numbers[" + i + "] = " + numbers[i]);
        }

        // Sum of array elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("  Sum of array elements = " + sum);

        // 2. Two-Dimensional Array (2D)
        System.out.println("\n2. Two-Dimensional Array:");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("  Matrix elements:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print("    " + matrix[row][col]);
            }
            System.out.println();
        }

        // Sum of all matrix elements
        int total = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                total += value;
            }
        }
        System.out.println("  Total sum of matrix = " + total);

        // 3. Jagged Array (rows of different lengths)
        System.out.println("\n3. Jagged Array:");
        int[][] jagged = {
            {1, 2},
            {3, 4, 5},
            {6}
        };

        for (int i = 0; i < jagged.length; i++) {
            System.out.print("  Row " + i + ": ");
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
