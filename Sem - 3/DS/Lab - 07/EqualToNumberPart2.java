import java.util.Scanner;
import java.util.Stack;

public class EqualToNumberPart2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string in the form of a and b = ");
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == 'a'){
                stack.push(str.charAt(i));
            }
            else if(str.charAt(i) == 'b'){
                stack.pop();
            }
            else{
                System.out.println("String is invalid");
            }
        }
        if(stack.empty()){
            System.out.println("Number of a and b are the same");
        }
        else{
            System.out.println("Number of a and b are not same");
        }
    }
}
