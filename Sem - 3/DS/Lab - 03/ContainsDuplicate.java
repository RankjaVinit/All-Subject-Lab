import java.util.Scanner;

public class ContainsDuplicate{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number : ");
            int length = sc.nextInt();
            int arr[] = new int[length];

            for(int i = 0 ; i < length ; i++){
                System.out.print("Enter Number - " + (i + 1) + " :");
                arr[i] = sc.nextInt();
            }

            int count = 0;

            for(int i = 0 ; i < length - 1; i++){
                for(int j = i + 1 ; j < length; j++){
                    if(arr[i] == arr[j]) count++;
                }
            }
            if(count > 0) System.out.println("Contain's Duplicate.");
            else System.out.println("Doesn't contain Duplicate.");
            sc.close();
        }
}