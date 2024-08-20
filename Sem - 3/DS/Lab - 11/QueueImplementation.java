
class QueueList{
    Node head = null;

    public void push(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        head.link = newNode;
    }

    public int remove(){
        if(head == null){
            System.out.println("There is no node available");
            return 0;
        }
        int ans = head.data;
        head = head.link;

        return ans;
    }

    public int peek(){
        if(head == null){
            System.out.println("There is no node available");
            return 0;
        }

        int peekAns = head.data;
        return peekAns;
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.link;
        }
    }
}

public class QueueImplementation {
    public static void main(String[] args){
        QueueList q1 = new QueueList();

        q1.push(10);
        q1.push(20);
        q1.push(30);
        q1.push(40);

        System.out.println("Here first element in queue is = "+q1.peek());

        System.out.println("popped element is = "+q1.remove());
        System.out.println("popped element is = "+q1.remove());
        System.out.println("popped element is = "+q1.remove());

        q1.push(50);

        q1.display();

    }
}
