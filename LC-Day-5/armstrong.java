import java.util.Scanner;

public class armstrong{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        sc.close();

        int original = n;
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }
        if(original == sum){
            System.out.println("Number is Armstrong");
           }
           else{
            System.out.println("Number is not Armstrong");
        }
    }
}