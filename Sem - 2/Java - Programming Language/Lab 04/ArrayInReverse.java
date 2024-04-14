public class ArrayInReverse {
    public static void main(String[] Args){
        int array[] = {1,24,35,67,89,235,90,6,45,67};
        for(int i = array.length - 1;i >= 0;i--){
            System.out.print(array[i] + ", ");
        }
    }
}
