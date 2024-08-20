public class BubbleSort{
	public static void main(String[] args) {
		int arr[] = {1,3,6,8,90,2,3,4,123};
		for(int i = 1 ; i < arr.length ; i++){
			for(int j = 0 ; j < arr.length - 1 ; j++){
				if(arr[j] > arr[j + 1]){
					arr[j] = arr[j] + arr[j + 1];
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] = arr[j] - arr[j + 1];
				}
			}
		}

		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
	}
}