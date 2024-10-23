package Recursion;

public class SumUpToTen {

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println("Sum of numbers from 1 to 10 is: " + result);
    }
}

