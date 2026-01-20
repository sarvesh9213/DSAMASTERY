package TWO_D_ARRAYS;

import java.util.Scanner;

public class MAXIMUM_IN_MATRIX {
    public static void input(int n , int[] []matrix) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {

                 matrix [i][j] = sc.nextInt();
            }

        }
    }
    public static void main(String[] args) {
     int [][] matrix = new int [3][3];
    }
}
