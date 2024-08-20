import java.util.Scanner;
import java.util.Stack;

class Eval{
    public void answer(String str){
        Stack<Integer> stack = new Stack<>();
        int ans = 0;

        for(int i = 0 ; i < str.length() ; i++){
            if(Character.isDigit(str.charAt(i))){
                stack.push((int)(str.charAt(i)));
            }
            else{
                int obj2 = stack.pop();
                int obj1 = stack.pop();

                if(str.charAt(i) == '+'){
                    stack.push(obj1 + obj2);
                }
                else if(str.charAt(i) == '-'){
                    stack.push(obj1 - obj2);
                }
                else if(str.charAt(i) == '/'){
                    stack.push(obj1 / obj2);
                }
                else if(str.charAt(i) == '*'){
                    stack.push(obj1 * obj2);
                }
            }
        }
        ans = stack.pop();
        System.out.println(ans);
    }
}

public class EvalPost{
    public static void main(String[] args){
        
        String str = "22*44*+4/";

        Eval e = new Eval();
        e.answer(str);
       
    }   
}