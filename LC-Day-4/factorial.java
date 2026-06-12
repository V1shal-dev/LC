public class factorial{
    public static void main(String[] args){
        int a = 10;
        int factorial = 1;

        while (a > 0){
            factorial = factorial * a;
            a--;
        } 

        // for(int i = 1; i <= a; i++){
        //     factorial = factorial * i;
        // }   

        System.out.println(factorial);
    }
}