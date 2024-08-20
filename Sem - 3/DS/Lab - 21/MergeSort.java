public class MergeSort{

	public static void merge(int[] arr, int l, int mid, int r){
		int i = l, j = mid + 1;		
		int b[] = new int[r - l + 1], h = 0;
		while(i <= mid && j <= r){
			if(arr[i] < arr[j]){
				b[h] = arr[i];
				i++;
			}		
			else{
				b[h] = arr[j];
				j++;
			}
			h++;	
		}

		while(i <= mid){
			b[h++] = arr[i++];
		}

		while(j <= r){
			b[h++] = arr[j++];
		}

		for(int k = l ; k <= r ; k++){
			arr[k] = b[k - l];
		}

	}

	public static void mergeSort(int[] arr, int l, int r){
		int mid = (l + r) / 2;
		if(r - l > 1){
			mergeSort(arr, l, mid);
			mergeSort(arr, mid + 1, r);
		}
		merge(arr, l, mid, r);
	}

	public static void main(String[] args) {
		int arr[] = {1,5,10,50,3,6,15,40,-1,-40};

		mergeSort(arr, 0, arr.length - 1);

		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
	}
}