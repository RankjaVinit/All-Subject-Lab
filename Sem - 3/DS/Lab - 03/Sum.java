import java.util.*;

public class Sum{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number - 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter Number - 2 : ");
        int b = sc.nextInt();
        if(a > b){
            a = a + b;
            b = a - b;
            a = a - b;
        }
        int sum = 0;
        for(int i = a;i <= b;i++) sum+=i;
        System.out.print("Sum = " + sum);
        sc.close();
    }
}