import java.util.Scanner;

public class DeleteDuplicate{

	public static int[] deleteDuplicate(int[] arr){
		int n = arr.length;
		for( int i = 0 ; i < n ; i++ ){
			int m = 0;
			for( int j = i + 1 ; j < n ; j++ ){
				if( arr[i] == arr[j] ){
					m++;
				}
				else {
					arr[j - m] = arr[j]; 
				}
			}
			n-=m;
		}

		int[] newArr = new int[n];
		for( int i = 0 ; i < n ; i++ ){
			newArr[i] = arr[i];
		}
		return newArr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of an array : ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            System.out.print("Number in index - " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }

        arr = deleteDuplicate(arr);

        System.out.println("Array after Deleting the Duplicate elements.");
        for(int j = 0 ; j < arr.length ; j++){
            System.out.print(arr[j] + " ");
        }
	}
}