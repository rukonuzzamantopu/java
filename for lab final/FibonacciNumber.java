import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n, a = 0, b = 1, c;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        n = s.nextInt();

        System.out.print("Fibonacci sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b; // Compute the next term
            a = b;     // Update `a` to the previous `b`
            b = c;     // Update `b` to the new term
        }

        s.close(); // Close the scanner to prevent resource leaks
    }
}
