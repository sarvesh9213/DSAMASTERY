package patterns;
public class kamyaPATTERN {

    public static void printK(int n) {

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++) {

                if(j == 1 ||
                        (i <= n/2 + 1 && j == (n/2 + 2 - i)) ||
                        (i > n/2 + 1 && j == (i - n/2))) {

                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printK(7);
    }
}
