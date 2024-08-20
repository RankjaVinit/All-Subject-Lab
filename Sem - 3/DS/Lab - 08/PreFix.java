import java.util.Scanner;
import java.util.Stack;

public class PreFix{

    public static int inputPrecedence(char c){
        if(c == '+' || c == '-') return 2;
        else if(c == '*' || c == '/') return 4;
        else if(c == '^') return 5;
        else if(c == '(') return 9;
        else if(c == ')') return 0;
        else return 7;
    }

    public static int stackPrecedence(char c){
        if(c == '+' || c == '-') return 1;
        else if(c == '*' || c == '/') return 3;
        else if(c == '^') return 6;
        else if(c == '(') return 0;
        else return 8;
    }

    public static int rank(char c){
        if(inputPrecedence(c) == 7) return 1;
        return -1;
    }

    public static String reverse(String string){
        String reverse = "";
        for(int i = string.length() - 1; i >= 0; i--){
            if(string.charAt(i) == '(') reverse += ')';
            else if(string.charAt(i) == ')') reverse += '(';
            else reverse += string.charAt(i);
        }
        return reverse;
    }

    public static String preFix(String s){
        Stack<Character> stack = new Stack<>();
        stack.push('(');
        String polish = "";
        int rank = 0;
        // System.out.println("S is " + s);
        String string = reverse(s);
        string += ')';
        // System.out.println("String is " + string);

        for(int i = 0;i < string.length();i++){
            if(stack.isEmpty()){
                return "Invalid String.";
            }
            while(stackPrecedence(stack.peek()) > inputPrecedence(string.charAt(i)) ){
                char top = stack.pop();
                polish += top;
                rank += rank(top);
            
                if(rank < 1){
                    System.out.println("PreFix is " + polish);
                    return "Invalid String.";
                }
            }
            if(stackPrecedence(stack.peek()) != inputPrecedence(string.charAt(i))){
                stack.push(string.charAt(i));
            }
            else{
                stack.pop();
            }
        }
        System.out.println("Rank = " + rank);
        return reverse(polish);
    }

    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String string = new String(sc.next());
        System.out.println("PreFix is " + preFix(string));
        sc.close();
    }
}