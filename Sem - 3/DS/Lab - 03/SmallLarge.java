import java.util.*;

public class SmallLarge{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            System.out.print("Enter Number - " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        int pmax = 0, pmin = 0;
        for(int i = 0;i < n;i++){
            if(arr[i] > arr[pmax]) pmax = i;
            else if(arr[i] < arr[pmin]) pmin = i;
        }
        System.out.print("min(index) = " + pmin + ", max(index) = " + pmax);
        sc.close();
    }
}