class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head = null;

    public void insertAtLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public LinkedList copyList(){
        LinkedList l2 = new LinkedList();

        Node temp = head;

        while(temp != null){
            l2.insertAtLast(temp.data);
            temp = temp.next;
        }
        return l2;
    }
}

public class CopyOfLinkedList{
    public static void main(String[] args){
        LinkedList l1 = new LinkedList();
        l1.insertAtLast(12);
        l1.insertAtLast(2);
        l1.insertAtLast(89);
        l1.insertAtLast(64);
        l1.insertAtLast(43);

        l1.display();

        LinkedList copied = l1.copyList();
        copied.display();
    }
}