import java.util.*;

public class ReadDisplay{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            System.out.print("Enter Number - " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i < n;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}