package TWO_D_ARRAYS;

import java.util.Scanner;

public class MAXIMUM_IN_MATRIX {
    public static void input(int[] []matrix) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {

                 matrix [i][j] = sc.nextInt();
            }

        }
    }

    public static void MAX_IN_ARRAY(int [][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if( matrix [i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("maximun in ur given array is :"+ max);
    }
    public static void main(String[] args) {
     int [][] matrix = new int [3][3];
     input(matrix);
     MAX_IN_ARRAY(matrix);
    }
}
