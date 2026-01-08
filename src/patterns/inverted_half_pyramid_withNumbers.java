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
        inverted_half_pyramid_withNumber(21
        );
    }
}
//"C:\Program Files\Java\jdk-24\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.1.2\lib\idea_rt.jar=54840" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\sarve\Downloads\Telegram Desktop\DSAMASTERY\out\production\DSAMASTERY" patterns.inverted_half_pyramid_withNumbers
//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21
//        1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
//        1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
//        1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
//        1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17
//        1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
//        1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
//        1 2 3 4 5 6 7 8 9 10 11 12 13 14
//        1 2 3 4 5 6 7 8 9 10 11 12 13
//        1 2 3 4 5 6 7 8 9 10 11 12
//        1 2 3 4 5 6 7 8 9 10 11
//        1 2 3 4 5 6 7 8 9 10
//        1 2 3 4 5 6 7 8 9
//        1 2 3 4 5 6 7 8
//        1 2 3 4 5 6 7
//        1 2 3 4 5 6
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1
//
//Process finished with exit code 0
