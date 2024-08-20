import java.util.*;

public class SumOfSeries{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        System.out.println("Sum of Series where (n == " + num + ") is " + ( (num)*(num + 1)*(num + 2)/6 ));
        sc.close();
    }
}