import java.util.Scanner;

public class AnagramGame{

    public static String toLower(String string){
        StringBuilder newString = new StringBuilder();
        for(int i = 0 ; i < string.length() ; i++){
            if( string.charAt(i) >= 'A' && string.charAt(i) <= 'Z' ) newString.append((char)(string.charAt(i) + 32));
            else newString.append(string.charAt(i));
        }
        return newString.toString();
    }

    public static int check(String s, String checkFrom){
        if( s.length() != checkFrom.length() ) return -1;
        int[] letter = new int[26];
        int n = s.length();
        int correctChar = 0;
        for(int i = 0 ; i < n ; i++){
            letter[ (int)checkFrom.charAt(i) - 97 ]++;
        }
        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i) < 'a' || s.charAt(i) > 'z'){
                System.out.println("Invalid Char - \'" + s.charAt(i) + "\'. ");
                return -2;
            }
            if(letter[ (int)s.charAt(i) - 97 ] != 0) correctChar++;
            letter[ (int)s.charAt(i) - 97 ]--;
        }
        // for(int i = 0 ; i < n ; i++){
        //     if( letter[ (int)checkFrom.charAt(i) - 97 ] != 0) return 0;
        // }
        return correctChar;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] words = {
            "Countless", "Count", "for", "Several", "Multiplied", "Crowded", "few", 
            "diverse", "other", "varied", "dissimilar", "various",
        };

        System.out.println("\n\t - Anagram Game -");

        int word = (int) ( Math.random() * words.length );

        System.out.println("\nLength of the word is " + words[word].length() + ".");

        int noTry = 0;
        boolean check = true;

        do{
            noTry++;

            System.out.println("\n\tTry - " + noTry + " : ");
            System.out.print("  Enter your word : ");
            String input = sc.next();

            int correctChar = check( toLower(input), toLower(words[word]) );

            if( correctChar == words[word].length() ) check = false;
            else if( correctChar == -1 ) System.out.println("Length of word is not equal.");
            else if( correctChar != -2 ) System.out.println("Number of correct words - " + correctChar + "");


        }while(check);


        System.out.println("\nYou complete the game in " + noTry + " Try.\n");
        
    }
}