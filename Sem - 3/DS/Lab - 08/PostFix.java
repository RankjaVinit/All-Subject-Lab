import java.util.Scanner;
import java.util.Stack;

public class PostFix{

    public static int inputPrecedence(char c){
        if(c == '+' || c == '-') return 1;
        if(c == '*' || c == '/') return 3;
        if(c == '^') return 6;
        if(c == '(') return 9;
        if(c == ')') return 0;
        return 7;
    }

    public static int stackPrecedence(char c){
        if(c == '+' || c == '-') return 2;
        if(c == '*' || c == '/') return 4;
        if(c == '^') return 5;
        if(c == '(') return 0;
        return 8;
    }

    public static int rank(char c){
        if(inputPrecedence(c) == 7) return 1;
        return -1;
    }

    public static String postFix(String string){
        Stack<Character> stack = new Stack<>();
        stack.push('(');
        String polish = "";
        int rank = 0;

        for(int i = 0;i < string.length();i++){
            if(stack.isEmpty()){
                System.out.println("\n1) PostFix is " + polish);
                return "Invalid String.";
            }
            while(stackPrecedence(stack.peek()) > inputPrecedence(string.charAt(i)) ){
                char top = stack.pop();
                polish += top;
                rank += rank(top);
                if(rank < 1){
                    System.out.println("\n2) PostFix is " + polish);
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
        return polish;
    }

    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String string = new String(sc.next());
        System.out.println("\nPostFix is " + postFix(string + ")"));
        sc.close();
    }
}