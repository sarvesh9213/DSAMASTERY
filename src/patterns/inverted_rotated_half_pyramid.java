package patterns;
public class inverted_rotated_half_pyramid {

    public static void inverted_rotated_half_pyramids(int n) {

        // outer loop -> rows
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // new line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_rotated_half_pyramids(7);
    }
}
