package homeworkweek8;

import java.util.Scanner;

public class Programme_3_VowelOrConsonant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input an alphabet: ");
        String input = sc.next();

        if (input.length() == 1) {
            char character = input.charAt(0);
            if ((character >= 'a' && character <= 'Z') || (character >= 'A' && character <= 'Z')) {
                char lowercaseChar = Character.toLowerCase(character);
                if (lowercaseChar == 'a' || lowercaseChar == 'e' || lowercaseChar == 'i' || lowercaseChar == 'o' || lowercaseChar == 'u') {
                    System.out.println("Input letter is Vowel");
                } else {
                    System.out.println("Input letter is consonant");
                }
            } else {
                System.out.println("Error: Not a valid alphabet character ");
            }
        } else {
            System.out.println("Enter: Input is not a single character ");
        }
    }
}

