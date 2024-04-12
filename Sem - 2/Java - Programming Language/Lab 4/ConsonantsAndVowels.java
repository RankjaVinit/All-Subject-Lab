import java.util.Scanner;

public class ConsonantsAndVowels {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Write any line : ");
        String line = sc.nextLine();
        int consonants = 0, vowels = 0;
        for(int i = 0;i < line.length();i++){
            if( line.charAt(i) == 'a' || line.charAt(i) == 'A' 
             || line.charAt(i) == 'e' || line.charAt(i) == 'E' 
             || line.charAt(i) == 'i' || line.charAt(i) == 'I'
             || line.charAt(i) == 'o' || line.charAt(i) == 'O' 
             || line.charAt(i) == 'u' || line.charAt(i) == 'U'  ){
                vowels++;
            }
            else if( line.charAt(i) == ' ' );
            else consonants++; 
        }
        System.out.println("VOWELS = " + vowels + ", CONSONANTS = " + consonants);
    }
}
