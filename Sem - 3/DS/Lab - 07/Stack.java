public class Stack{
    int[] arr;
    int top = -1;
    public Stack(int n){
        arr = new int[n];
    }
    public void push(int num){
        if(top >= arr.length - 1){
            System.out.println("Stack Overflow.");
            return;
        }
        top++;
        arr[top] = num;
    }
    public int pop(){
        if(top == -1){
            System.out.println("Stack Underflow(Empty).");
            return -1;
        }
        return arr[top--];
    }
    public void display(){
        if(top == -1){
            System.out.println("Stack Underflow(Empty).");
            return;
        }
        for(int i = 0;i <= top;i++) System.out.println(arr[i] + " ");
    }
    public int peep(int p){
        int temp = top - p + 1;
        if(top < 0){
            System.out.println("Invalid Number.");
            return -1;
        }
        return arr[temp];
    }
    public void change(int p, int num){
        int temp = top - p + 1;
        if(top < 0){
            System.out.println("Invalid Number.");
            return;
        }
        arr[temp] = num;
        System.out.println("Changed Number.");
    }
}