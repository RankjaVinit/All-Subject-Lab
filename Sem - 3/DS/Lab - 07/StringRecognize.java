import java.util.Scanner;
import java.util.Stack;

public class StringRecognize {

    public static boolean checkString(String str){
        Stack<Character> s = new Stack<>();

        int index = 0;
        s.push('c');
        char next = str.charAt(index);

        while(next != 'c'){
            if(next == ' '){
                System.out.println("Invalid String");
                return false;
            }
            s.push(next);
            index++;
            next = str.charAt(index);
        }

        index++;

        while(s.peek() != 'c' && index < str.length()){
            next = str.charAt(index);

            if(next != s.pop()){
                System.out.println("Invalid String");
                return false;
            }

            index++;
        }

        next = str.charAt(index - 1);

        if(next != ' ' && s.peek() != 'c' && index != str.length()){
            System.out.println("Invalid String");
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string = ");
        String str = sc.nextLine();

        if(checkString(str)){
            System.out.println("Valid String");
        }
        else{
            System.out.println("Invalid String");
        }
    }
}
