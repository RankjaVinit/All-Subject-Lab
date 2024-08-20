import java.util.*;

public class Factors{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        System.out.print("Factors of " + num + " : 1");
        for(int i = 2;i <= num/2;i++){
            if(num % i == 0) System.out.print(", " + i);
        } 
        System.out.println(".");
        sc.close();
    }
}