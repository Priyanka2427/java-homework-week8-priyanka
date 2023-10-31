package homeworkweek8;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */

public class Programme_12_PrimeNumberChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number ");
        } else {
            System.out.println(number + " is not a prime number ");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        if (num <= 3) {
            return true;
        }

        // Check if the number is divisible by 2 or 3
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        // Check for prime factors using 6k +/- 1 rule
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}