import java.util.Scanner;

public class ChangeCase{

	public static String toLower(String string){
		StringBuilder newString = new StringBuilder();
		for(int i = 0 ; i < string.length() ; i++){
			if( string.charAt(i) >= 'A' && string.charAt(i) <= 'Z' ) newString.append((char)(string.charAt(i) + 32));
			else newString.append(string.charAt(i));
		}
		return newString.toString();
	}

	public static String toUpper(String string){
		StringBuilder newString = new StringBuilder();
		for(int i = 0 ; i < string.length() ; i++){
			if( string.charAt(i) >= 'a' && string.charAt(i) <= 'z' ) newString.append((char)(string.charAt(i) - 32));
			else newString.append(string.charAt(i));
		}
		return newString.toString();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your String : ");
		String string = new String(sc.next());

		String toLower = toLower(string);
		String toUpper = toUpper(string);

		System.out.println("To Lower : " + toLower);
		System.out.println("To Upper : " + toUpper);

	}
}