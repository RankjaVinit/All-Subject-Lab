import java.util.Scanner;

public class Pyramid {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Write any line : ");
        String line = sc.nextLine();

        int length = line.length();
        for(int i = 0;i < length;i++){
            for(int j = length;j > i + 1;j--) System.out.print(" ");
            for(int j = 0;j <= i;j++) System.out.print(line.charAt(j) + " ");
            System.out.println("");
        }
    }
}
