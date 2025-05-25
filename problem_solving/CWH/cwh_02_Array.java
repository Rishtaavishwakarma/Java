
import java.util.Arrays;

public class cwh_02_Array {
//1 Write a Java program to print the elements of an array in reverse order.

    public static void Reverse_Array() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    //2 For each loop
    public static void for_each() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int num : arr) {
            System.out.println(num);
        }
    }

    //3 Create an array of 5 floats and calculate their sum.
    public static float Sum_float(float[] args) {
        float sum = 0;
        for (float i : args) {
            sum += i;
        }
        return sum;
    }

    //4 Write a program to find out whether a given integer is present in an array or not.
    static boolean find(int[] args, int num) {
        boolean result = false;
        for (int i : args) {
            if (i == num) {
                result = true;
            }
        }
        return result;
    }

    // 5 Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
    static int Avg(int[] args) {
        int avg = 0;
        for (int i : args) {
            avg += i;
        }
        return avg / args.length;
    }
//Question-6:Create a Java program to add two matrices of size 2x3

    static void add2DMat(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != 2 || matrix1[0].length != 3 || matrix2.length != 2 || matrix2[0].length != 3) {
            System.out.println("This matrix is not a 2X3 matrix");
            return;
        }
        int[][] newMat = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                newMat[i][j] = matrix1[i][j] + matrix2[i][j];
            }

        }
        System.out.println(Arrays.deepToString(newMat));

    }
//7 Write a Java program to reverse an array.

    static void reverseArr(String[] args) {
        for (int i = 0; i < args.length / 2; i++) {
            String acc = args[i];
            args[i] = args[args.length - 1 - i];
            args[args.length - 1 - i] = acc;
        }
        System.out.println(Arrays.toString(args));
    }
    //8 Write a Java program to find the maximum element in an array

    public static void MaxInArray() {

        int[] arr = {12, 5, 30, 25, 89, 7};

        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Maximum element: " + max);
    }
//array sorted or not

    public static boolean Sorted(int[] args) {
        for (int i = 0; i < args.length - 1; i++) {
            if (args[i] > args[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Reverse_Array();
        // for_each();

        // float result1 = Sum_float(new float[]{0.1f, 0.2f, 0.5f});
        // System.out.println("result " + result1);
        // boolean result1 = find(new int[]{4, 5, 8}, 1);
        // System.out.println("result " + result1);
        // int result1 = Avg(new int[]{4, 4, 5, 8, 5});
        // System.out.println("result " + result1);
        // int[][] mat1 = {{1, 2, 3}, {4, 5, 6}};
        // int[][] mat2 = {{1, 2, 3}, {4, 5, 6}};
        // add2DMat(mat1, mat2);
        // System.out.println("result " + result1);
        // String[] arr = new String[]{"apple", "banana", "cherry"};
        // reverseArr(arr);
        // MaxInArray();
        //     boolean sort = Sorted(new int[]{1, 2, 3, 4});
        //     System.out.println(sort);
    }
}
