import java.util.Scanner;

class Queue{
    int front = -1;
    int rear = -1;
    int length;
    int [] queue;

    public Queue(int length){
        this.length = length;
        queue = new int[length];
    }

    public void enqueue(int data){
        if(rear == -1){
            queue[0] = data;
            front = 0;
            rear = 0;
            return;
        }
            rear = rear + 1;

            if(rear >= length){
                System.out.println("Stack Overflow");
                return;
            }

            queue[rear] = data;
    }

    public int dequeue(){
        if(front == -1){
            System.out.println("stack underflow");
            return 0;
        }

        if(front == rear){
            return queue[front];
        }

        front = front + 1;
        return queue[front - 1];
    }

    public void display(){

        if(front == -1){
            System.out.println("Queue underflow");
            return;
        }

        if(front == rear){
            System.out.println(queue[rear] + " ");
            return;
        }

        for(int i = front ; i < rear ; i++){
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

public class DemoQueue{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of length = ");
        int length = sc.nextInt();

        Queue q = new Queue(length);

        for(int i = 1 ; i <= length ; i++){
            q.enqueue(i);
        }

        q.display();

        int ans = q.dequeue();
        System.out.println("Display element which has been dequeed = "+ans);
        sc.close();

    }
}