public class isprime{
    public static void main(String[] args){
        int num = 7;
        boolean isPrime = false;

        for(int i = 2; i <= num/2; i++){
            if(num % i == 0){
                isPrime = true;
                break;
            }
        }
        if(isPrime){
            System.out.println("Number is not prime");
        }else{
            System.out.println("Number is prime");
        }
    }
}