import java.util.*;

public class Power{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        int b = sc.nextInt();
        System.out.print("Enter power : ");
        int p = sc.nextInt();
        int ans = 1;
        for(int i = 1;i <= p;i++) ans*=b;
        System.out.println(b + "^" + p + " = " + ans);
        sc.close();
    }
}