import java.util.Scanner;
public class Avg {
    public static void main(String[] Args){

        int number[] = new int[5], i, avg = 0;

        try (Scanner sc = new Scanner(System.in)) {
            for(i = 0;i < 5;i++){
                System.out.print("Enter Number " + (i + 1) + " : " );
                number[i] = sc.nextInt();
                avg+=number[i];
            }

            sc.close();
        }

        System.out.println("Avg of number : " + avg/5);
    }
}