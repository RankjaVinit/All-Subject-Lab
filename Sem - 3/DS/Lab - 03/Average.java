import java.util.*;

public class Average{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            System.out.print("Enter Number - " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0;i < n;i++){
            sum+=arr[i];
        }
        System.out.print("Average of Numbers of array = " + (double)sum/n);
        sc.close();
    }
}