public class Largest{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 70;
        int e = 80;
        int f = 90;
        int g = a+b+e+f;
        int h = a+b+c+d;
        int i = a*h+h;

        System.out.println("a: " + a + " b: " + b + " c: " + c + " d: " + d + " e: " + e + " f: " + f + " g: " + g + " h: " + h + " i: " + i);

        int Largest = Math.max(a, Math.max(b, Math.max(c, Math.max(d, Math.max(e, Math.max(f, Math.max(g, Math.max(h, i))))))));
        System.out.println("Largest number is: " + Largest);
    }
}