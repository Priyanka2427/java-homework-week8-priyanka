package homeworkweek8;
/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So: 1+125+27 = 153
 */

import java.util.Scanner;

public class Programme_10_ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number ");
        } else {
            System.out.println(number + " is not an Armstrong number ");
        }
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int num) {
        int originalNumber = num;
        int result = 0;
        int n = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            result += Math.pow(digit, n);
            num /= 10;
        }
        return result == originalNumber;
    }
}
