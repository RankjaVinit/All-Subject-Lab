public class AggregateFunction{

	public static int sum(int[] arr){
		int sum = 0;
		for( int i = 0 ; i < arr.length ; i++ ){
			sum += arr[i];
		}
		return sum;
	}

	public static int minimum(int[] arr){
		int min = Integer.MAX_VALUE;
		for( int i = 0 ; i < arr.length ; i++ ){
			if(min > arr[i]) min = arr[i];
		}
		return min;
	}

	public static int maximum(int[] arr){
		int max = Integer.MIN_VALUE;
		for( int i = 0 ; i < arr.length ; i++ ){
			if(max < arr[i]) max = arr[i];
		}
		return max;
	}

	public static double average(int[] arr){
		return (double) sum(arr) / arr.length;
	}

	public static void main(String[] args) {
		int arr[] = {1,10,50,100,500,1000};
		System.out.println("Average = " + average(arr));
		System.out.println("Minimum = " + minimum(arr));
		System.out.println("Maximum = " + maximum(arr));
		System.out.println("Sum = " + sum(arr));
	}
}