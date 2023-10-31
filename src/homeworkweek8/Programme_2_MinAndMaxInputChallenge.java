package homeworkweek8;

import java.util.Scanner;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge
 */
public class Programme_2_MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (true) {
            System.out.println("Enter number: ");
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                min = Math.min(min, number);
                max = Math.max(max, number);
            } else {
                break; // Break out of the loop on an invalid input
            }
            sc.nextLine(); // consume the newline character
        }

        System.out.println("Minimum numer entered : " + (min == Integer.MAX_VALUE ? "N/A" : min));
        System.out.println("Maximum numer entered : " + (max == Integer.MIN_VALUE ? "N/A" : max));
    }

}

