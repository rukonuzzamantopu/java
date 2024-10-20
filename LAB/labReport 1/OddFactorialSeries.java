import java.util.Scanner;

public class OddFactorialSeries {

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static double calculateSum(double x, int n) {
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += Math.pow(x, i) / factorial(i);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();
        
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        double result = calculateSum(x, n);
        System.out.println("The result of the summation is: " + result);
    }
}
