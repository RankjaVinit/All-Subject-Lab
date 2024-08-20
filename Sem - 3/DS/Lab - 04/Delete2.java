import java.util.Scanner;

public class Delete2 {

    static int[] arr;

    public static void deleteElement(int element){

        boolean find = false;

        for(int n : arr){
            if(n == element) find = true;
        }

        if(!find){
            System.out.println("Element not found");
            return;
        }

        int[] tempArr = new int[arr.length - 1];

        int i = 0;

        while (i < arr.length && arr[i] < element) {
            tempArr[i] = arr[i];
            i++;
        }

        i++;

        while(i < arr.length){
            tempArr[i-1] = arr[i];
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

        deleteElement(element);

        for(int i : arr){
            System.out.print(i + " ");
        }

        sc.close();
    }
}

