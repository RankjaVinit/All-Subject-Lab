import java.util.Scanner;


public class SumOfMatrix{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int [][][] arr = new int[3][2][2];

        for(int i = 0 ; i < 2 ; i++){

            System.out.println("Enter matrix-" +i+ " : ");

            for(int j = 0 ; j < 2 ; j++){
                for(int k = 0 ; k < 2 ; k++){
                    System.out.println("Enter an element "+(j + 1)+ " "+(k + 1)+ " ");
                    arr[i][j][k] = sc.nextInt();
                }
            }
       }

       for(int i = 0 ; i < 2 ; i++){
        for(int j = 0 ; j < 2 ; j++){
            arr[2][i][j] = arr[0][i][j] + arr[1][i][j];
            System.out.print(arr[2][i][j] + " ");
        }
        System.out.println();
       }
    }
}