class Node{
    int data;
    Node link;

    Node(int data){
        this.data = data;
        this.link = null;
    }
}

class List{
    Node top = null;

    public void push(int data){
        Node newNode = new Node(data);

        if(top == null){
            top = newNode;
            return;
        }
        newNode.link = top;
        top = newNode;
    }

    public int pop(){
        if(top == null){
            System.out.println("There is no node available");
            return 0;
        }
        Node temp = top;

        top = top.link;
        return temp.data;
    }

    public int peek(){
        if(top == null){
            System.out.println("There is no node available");
            return 0;
        }
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }
}

public class StackImplement{
    public static void main(String[] args){
        List l1 = new List();

        l1.push(10);
        l1.push(20);
        l1.push(30);
        l1.push(33);

        System.out.println("Top element is = " + l1.peek());
        System.out.println("popped element is = "+l1.pop());
        System.out.println("Popped element is = "+l1.pop());

        System.out.println("top element is = "+l1.peek());

        l1.push(55);

        System.out.println("popped element is = "+l1.pop());
        System.out.println("popped element is = "+l1.pop());
    }
}