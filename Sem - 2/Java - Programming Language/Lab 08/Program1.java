import java.lang.Math;

public class Program1{
    public static void main(String args[]){
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]); 
            
            if(a == 0){
                throw new MyException("Base is 0");
            }
            if(b < 0){
                throw new MyException("Power is negative");
            }
            System.out.println(a + " ^ " + b + " = " + Math.pow(a,b));
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

class MyException extends Exception {
    public MyException(String message){
        super(message);
    } 
    
}