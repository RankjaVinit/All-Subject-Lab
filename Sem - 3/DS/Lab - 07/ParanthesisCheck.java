import java.util.Scanner;
import java.util.Stack;

public class ParanthesisCheck {

    public static boolean stringBalanced(String str){

        Stack<Character> s = new Stack<>();

        for(char ch : str.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }
            else if(ch == ')' || ch == '}' || ch == ']'){
                if(s.isEmpty()){
                    return false;
                }
                char top = s.pop();
                if(!isCheck(top , ch)){
                    return false;
                }
            }
        }
        return s.isEmpty();
    }

    public static boolean isCheck(char open , char close){
        return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']'); 
    }


    public static void main(String[] args){
       
        String [] testCases = {
            "()",
            "([)]",
            "([{}()])[{}]",
            "[{{}]",
        };

        for(int i = 0 ; i < testCases.length ; i++){
            String str = testCases[i];
            
            if(stringBalanced(str)){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }

    }
}
