import java.util.Scanner;
import java.util.Stack;

class EvalP{
    public void answer(String str){
        Stack<Integer> stack = new Stack<>();
        int ans = 0;

        for(int i = str.length() - 1 ; i >= 0 ; i++){
            if(Character.isDigit(str.charAt(i))){
                stack.push((int)(str.charAt(i)));
            }
            else{
                int obj1 = stack.pop();
                int obj2 = stack.pop();

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

public class EvalPre{
    public static void main(String[] args){
        
        String str = "22*44*+4/";

        EvalP e = new EvalP();
        e.answer(str);
       
    }   
}