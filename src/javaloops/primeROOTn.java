import java.util.Scanner;

public class primeROOTn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("n is not prime");
            return;
        }

        if (n == 2) {
            System.out.println("n is prime");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;     // MOST IMPORTANT optimization
            }
        }

        if (isPrime) {
            System.out.println("n is prime");
        } else {
            System.out.println("n is not prime");
        }
    }
}
