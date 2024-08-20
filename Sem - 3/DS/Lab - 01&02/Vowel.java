import java.util.*;

public class Vowel {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character : ");
        char c = sc.next().charAt(0);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
        System.out.println("You Entered Vowel.");
        else System.out.println("You Entered Consonants.");
        sc.close();
    }
}
