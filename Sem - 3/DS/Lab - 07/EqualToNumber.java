import java.util.Scanner;

public class EqualToNumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String = ");
        String str = sc.nextLine();
        int top = -1;
        int [] arr = new int[str.length()];
        int counta = 0;
        int countb = 0;

        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i) == 'a'){
                if(top >= arr.length - 1){
                    System.out.println("Stack Overflow");
                    return;
                }
                else{
                    top = top + 1;
                    arr[top] = str.charAt(i);
                    counta++;
                }
            }
            else if(str.charAt(i) == 'b'){
                if(top <= -1){
                    System.out.println("Stack Underflow");
                    return;
                }
                else{
                    top = top - 1;
                    countb++;
                }
            }
        }

        if(counta == countb){
            System.out.println("Number of a and b are the same");
        }
        else{
            System.out.println("Number of a and b are not same");
        }

    }
}
