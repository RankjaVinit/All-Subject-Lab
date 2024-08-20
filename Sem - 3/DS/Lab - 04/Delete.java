import java.util.Scanner;

public class Delete {

    static int[] arr;

    public static void deleteAtPosition(int position){

        if(position >= arr.length) {
            return;
        }
        int[] tempArr = new int[arr.length-1];

        for(int i = 0 ; i < position ; i++){
            tempArr[i] = arr[i];
        }

        for(int i = position+1 ; i < arr.length ; i++){
            tempArr[i-1] = arr[i];
        }

        arr = tempArr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of an array : ");
        int n = sc.nextInt();
        arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i : arr){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Enter position :");
        int position = sc.nextInt();

        deleteAtPosition(position);

        for(int i : arr){
            System.out.print(i + " ");
        }

        sc.close();
    }
}