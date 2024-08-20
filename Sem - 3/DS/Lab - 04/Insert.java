import java.util.Scanner;

public class Insert{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of an array");
        int n = sc.nextInt();

        System.out.println("Enter number which you want to insert");
        int insertNumber = sc.nextInt();

        int [] arr = new int[n+1];

        for(int i = 0 ; i < n ; i++){
            System.out.println("Enter your number in an array at index " + (i+1));
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the location of the number you want to insert");
        int location = sc.nextInt();

        int i = n;

        while(i > location) {
            arr[i] = arr[i - 1];
            i--;
        }
        arr[i] = insertNumber;

        for(int j = 0 ; j <= n ; j++){
            System.out.print(arr[j] + "");
        }
    }
}