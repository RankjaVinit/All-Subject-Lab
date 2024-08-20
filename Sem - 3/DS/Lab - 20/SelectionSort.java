import java.util.Arrays;

public class SelectionSort{
	public static void main(String[] args) {
		int arr[] = {1,2,5,8,9,0,3,4,545,-5,-1,-9};	
		int minp;
		for(int i = 0 ; i < arr.length - 1 ; i++){
			minp = i;
			for(int j = i + 1 ; j < arr.length ; j++){
				if(arr[minp] > arr[j]){
					minp = j;
				}
			}
			if(minp == i) continue;
			arr[i] = arr[i] + arr[minp];
			arr[minp] = arr[i] - arr[minp];
			arr[i] = arr[i] - arr[minp];
		}

		// for(int i = 0 ; i < arr.length ; i++){
		// 	System.out.print(arr[i] + " ");
		// }
		System.out.println(Arrays.toString(arr));
	}
}	