package homeworkweek8;

/**
 * Display left angle triangle of * using nested for loops by java
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class Programme_15_LeftTriangle {

    public static void main(String[] args) {
        int rows = 5; // You can change this value to adjust the size of the triangle

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
