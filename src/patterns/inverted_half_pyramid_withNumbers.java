package patterns;
public class inverted_half_pyramid_withNumbers {

    public static void inverted_half_pyramid_withNumber(int n) {

        for (int i = 1; i <= n; i++) {

            // numbers
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }

            // new line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_half_pyramid_withNumber(213
        );
    }
}
