import java.util.Scanner;

public class ReplaceNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the number which you want to replace : ");
        int oldNumber = sc.nextInt();

        System.out.print("Enter the new number : ");
        int newNumber = sc.nextInt();
        
        System.out.println("Enter Array : ");
        for(int i = 0 ; i < n ; i++){
            System.out.println("Enter Number - " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < n ; i++){
            if(arr[i] == oldNumber){
                arr[i] = newNumber;
                System.out.println("Index of the new number is = " + i);
            }
        }

        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
