import java.util.*;

public class countvowels{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        sc.close();

        int count = 0;
        int ch = str.charAt(i);
        
        for(int i = 0; i < str.length(); i++){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("Number of Vowels: " + count);
    }
}

