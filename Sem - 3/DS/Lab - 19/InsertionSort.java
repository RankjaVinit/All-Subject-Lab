public class  InsertionSort{
	public static void main(String[] args) {
		int arr[] = {1,5,10,50,3,6,15,40,-1,-40};

		for(int i = 1 ; i < arr.length ; i++){
			int j = i - 1;
			int data = arr[i];
			while(j >= 0 && arr[j] > data){
				arr[j + 1] = arr[j];
				j--;
			}
			arr[++j] = data;
		}

		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
	}
}