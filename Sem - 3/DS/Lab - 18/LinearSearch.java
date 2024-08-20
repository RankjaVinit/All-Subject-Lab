import java.util.*;

public class LinearSearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Which number do you want to Find : ");
        int key = sc.nextInt();
        int i, arr[] = {1,3,5,7,9,0,12,2,6,8,15};
        for(i = 0; i < arr.length ; i++){
            if(arr[i] == key ){
                System.out.println("The Number is in index - " + i);
                break;
            }
        }
        if(i >= arr.length) System.out.println("Number not found.");
        sc.close();
    }
}