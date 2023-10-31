package homeworkweek8;
/**
 * 14. Write a program in Java to display the pattern like a diamond.
 * While loop
 *                                           .
 *
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *****
 * *****
 * ***
 * *
 */

import java.util.Scanner;

public class Programme_14_DiamondPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number for the number of rows.");
            return;
        }

        int i = 1;

        // Upper part of the diamond
        while (i <= n / 2 + 1) {
            int j = 1;

            while (j <= n / 2 + 1 - i) {
                System.out.print(" ");
                j++;
            }

            j = 1;

            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }

        // Lower part of the diamond
        i = 1;

        while (i <= n / 2) {
            int j = 1;

            while (j <= i) {
                System.out.print(" ");
                j++;
            }

            j = 1;

            while (j <= n - 2 * i) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }

        scanner.close();
    }
}