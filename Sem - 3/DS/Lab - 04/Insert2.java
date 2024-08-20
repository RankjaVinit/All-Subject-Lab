import java.util.Scanner;

public class Insert2 {

    static int[] arr;

    public static void insertElement(int element){

        int[] tempArr = new int[arr.length + 1];
        int i = 0;

        while(i < arr.length && arr[i] < element){
            tempArr[i] = arr[i];
            i++;
        }

        tempArr[i] = element;

        while(i < arr.length){
            tempArr[i+1] = arr[i];
            i++;
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

        System.out.println("Enter an element : ");
        int element = sc.nextInt();

        insertElement(element);

        for(int i : arr){
            System.out.print(i + " ");
        }

        sc.close();
    }
}