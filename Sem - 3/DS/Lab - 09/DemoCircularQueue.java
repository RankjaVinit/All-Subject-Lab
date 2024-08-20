
public class DemoCircularQueue{
    public static void main(String[] args){
        Queue q = new Queue(10);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.display();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.display();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.display();
        q.dequeue();
        q.display();

    }
}


class CircularQueue {
    int n;
    int[] queue;
    int rear = -1;
    int front = -1;

    Queue(int n){
        this.n = n;
        queue = new int[n];
    }

    void enqueue(int data){
        if(rear == -1){
            queue[0] = data;
            front = rear = 0;
            return;
        }
        rear = (rear + 1)%n;
        if(rear == front){
            rear = (n + rear - 1)%n;
            System.out.println("Queue overflow...");
            return;
        }
        queue[rear] = data;
    }

    void dequeue(){
        if(front == -1){
            System.out.println("Queue underflow...");
            return;
        }

        if(front == rear){
            rear = -1;
            front = -1;
            return;
        }

        front = (front + 1) % n;

    }

    void display(){
        if(front == -1){
            System.out.println("Queue underflow...");
            return;
        }
        int temp = front;
        while(rear != temp){
            System.out.print(queue[temp] + " ");
            temp = (temp + 1)%this.n;
        }
        System.out.println(queue[temp] + " ");
    }


}