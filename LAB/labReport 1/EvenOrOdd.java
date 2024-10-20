import java.util.Scanner;
public class EvenOrOdd{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n;
        n = s.nextInt();

        if(n%2==0){
            System.out.println(n+" is a even number");
        }
        else{
            System.out.println(n+" is a odd number");
        }
        s.close();
    }
}
