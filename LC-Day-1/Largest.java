public class Largest{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = a+b;

        int Largest = Math.max(a, Math.max(b,c));
        System.out.println(Largest);
    }
}