public class reversenum{
    public static void main(String[] args){
        int num = 12345;
        int reverse = 0;

        for(int i = num; i > 0; i = i/10){
            reverse = reverse * 10 + i %10;
        }
        System.out.println(reverse);
    }
}