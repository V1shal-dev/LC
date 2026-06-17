public class palindrome{
    public static void main(String[] args){
        int n = 1331;
        int temp = n;
        int rev = 0;

        while(n > 0){
            int lastdigit = n % 10;
            rev = (rev * 10) +lastdigit;
            n = n/10;
        }
        if(temp == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        
    }
}