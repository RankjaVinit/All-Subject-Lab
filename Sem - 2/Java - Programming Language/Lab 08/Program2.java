public class Program2 {
    public static void main(String args[]){
        int i = 0, sum = 0;
        boolean bool = (args != null) ? true : false ;
        while(bool){
            try{
                int a = Integer.parseInt(args[i]); 
                i++;
                if(a < 0){
                    throw new MyException("No. " + i + " is negative.");
                }
                else if(a%10 == 0){
                    throw new MyException("No. " + i + " is divisible by 10.");
                }
                else if(a < 2000 && a > 1000){
                    throw new MyException("No. " + i + " is greater than 1000 and less than 2000.");
                }
                else if(a > 7000){
                    throw new MyException("No. " + i + " is greater than 7000.");
                }
                else sum+=a; 
            }
            catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
            catch (MyException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        System.out.println("\nThe Sum of number's is " + sum + ".");
    }

}

class MyException extends Exception {
    public MyException(String message){
        super(message);
    } 
    
}