package homeworkweek8;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme_9_FibonacciSequence {

    public static void main(String[] args) {
        int n = 8; //The number of terms in the sequence

        int first = 1;
        int second = 1;

        System.out.println(first + "  " + second + " ");

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.println(next + " ");
            first = second;
            second = next;
        }
    }
}
