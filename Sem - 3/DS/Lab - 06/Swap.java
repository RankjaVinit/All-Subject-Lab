public class Swap{
    static void swap(int arr[], int a, int b){
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }

    static void print(int arr[]){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] A){
        int arr[] = {1,4,5,7,9,2,5,8,0};
        print(arr);
        swap(arr,4,6);
        print(arr);
    }
}