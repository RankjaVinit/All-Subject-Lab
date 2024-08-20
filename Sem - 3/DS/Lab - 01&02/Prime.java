import java.util.*;

public class Prime{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int i;
        for(i = 2;i <= Math.sqrt(num);i++){
            if(num % i == 0){
                System.out.println(num + " is Non-Prime Number.");
                break;
            }
        } 
        if(i > Math.sqrt(num)) System.out.println(num + " is Prime Number.");
        sc.close();
    }
}