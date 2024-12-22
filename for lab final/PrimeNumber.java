import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args []){
        int num, i, count=0;
        Scanner scan =new Scanner(System.in);
        num=scan.nextInt();
        for(i=2;i<num;i++)
        {
            if(num%i==0)
            {
                count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.println("this is a prime number");

        }else{
            System.out.println("not prime number");
        }
    }
}
