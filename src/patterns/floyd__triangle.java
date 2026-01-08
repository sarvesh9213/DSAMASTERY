package patterns;
public class floyd__triangle {

    public static void floyds_triangle(int n) {

        int counter = 1;

        // outer loop -> rows
        for (int i = 1; i <= n; i++) {

            // inner loop -> numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }

            // new line after every row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floyds_triangle(4);
    }
}
