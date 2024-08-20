import java.util.*;

public class Factorial1{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int ans = 1;
        for(int i = 2;i <= num;i++) ans*=i;
        System.out.println(num + "! = " + ans);
        sc.close();
    }
}
