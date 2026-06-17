import java.util.*;

public class removespace{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        sc.close();

        String result = str.replaceAll(" ", "");
        System.out.println("String without spaces: " + result);
    }
}