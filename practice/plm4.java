package practice;

public class plm4 {

    public static void main(String[] args) {
        plm4 obj = new plm4();
        obj.start();
    }

    void start() {
        long[] arr = {13, 3, 5, 11};
        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");
        System.out.print(arr[2] + " ");
        System.out.println(arr[3]); // Using println to move to the next line
    }

    long fix(long[] arr) {
        return arr[1]; // This method currently just returns the second element of the array
    }
}
