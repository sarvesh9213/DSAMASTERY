package functions_methods;
public class BinaryDecimal {

    public static int binaryToDecimal(int bin) {
        int decimal = 0;
        int pow = 0;

        while (bin > 0) {
            int lastDigit = bin % 10;      // last binary digit
            decimal = decimal + lastDigit * (int) Math.pow(2, pow);
            pow++;
            bin = bin / 10;
        }
        return decimal;
    }
}
