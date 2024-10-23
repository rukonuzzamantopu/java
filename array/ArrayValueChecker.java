package array;
import java.util.Scanner;

public class ArrayValueChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Enter the value to check: ");
        int value = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (numbers[i] == value) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The array contains the value: " + value);
        } else {
            System.out.println("The array does not contain the value: " + value);
        }
        scanner.close();
    }
}
