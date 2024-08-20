import java.util.*;

public class Factorial2{

    static int fact(int n){
        if(n < 2) return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        System.out.println(num + "! = " + fact(num));
        sc.close();
    }
}
