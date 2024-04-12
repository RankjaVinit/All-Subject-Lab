import java.util.Scanner;

public class DiamondShape {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int length = sc.nextInt();
        for(int i = 0;i < length;i++){
            for(int j = length;j > i + 1;j--) System.out.print(" ");
            for(int j = 0;j <= i;j++) System.out.print("* ");
            System.out.println("");
        }  
        for(int i = length - 2;i >= 0;i--){
            for(int j = length;j > i + 1;j--) System.out.print(" ");
            for(int j = 0;j <= i;j++) System.out.print("* ");
            System.out.println("");
        }  
         
    }
}
