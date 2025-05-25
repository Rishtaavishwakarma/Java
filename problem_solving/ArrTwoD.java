
import java.util.Arrays;

public class ArrTwoD {

    public static void main(String[] args) {

        //way one
        int[][] twoDArr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr[i].length; j++) {
                twoDArr[i][j] = twoDArr[i][j] * 2;
                System.out.println(twoDArr[i][j]);
            }
        }

        //way two
        int[][] twoArr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < twoArr.length; i++) {
            for (int j = 0; j < twoArr[i].length; j++) {
                twoArr[i][j] = twoArr[i][j] * 2;

            }
        }
        System.out.println(Arrays.deepToString(twoArr));

    }
}
