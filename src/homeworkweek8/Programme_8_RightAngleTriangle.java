package homeworkweek8;

/**
 * Display right angle triangle of @ using nested for loops in java
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Programme_8_RightAngleTriangle {

    public static void main(String[] args) {
        int n = 5; // The number of rows in the triangle

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}