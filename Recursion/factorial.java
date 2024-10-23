package Recursion;

public class factorial {

        public static int sum(int n) {
            if (n == 1) {
                return 1;
            } else {
                return sum(n - 1) * n ;
            }
        }
    
        public static void main(String[] args) {
            int result = sum(6);
            System.out.println("factorial of numbers from 1 to 10 is: " + result);
        }
    }
    

