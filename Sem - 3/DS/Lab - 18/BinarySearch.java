import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which number do you want to Find : ");
        int key = sc.nextInt();
        int arr[] = {-115,-18,-16,-13,-12,10,-9,-7,-5,-3,-1,0,1,3,5,7,9,10,12,13,16,18,115};
        int l = 0, r = arr.length - 1 , m;

        while(l <= r){
            m = (l + r) / 2;
            if(arr[m] == key ){
                System.out.println("The Number is in index - " + m);
                break; 
            }
            else if(arr[m] > key) r = m - 1;
            else l = m + 1;
        }   
        if(l > r) System.out.println("Number not found.");
    }
}
