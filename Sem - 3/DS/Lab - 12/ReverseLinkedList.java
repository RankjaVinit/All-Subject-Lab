class LinkedListDemo{
    Node head = null;

    public void insertAtTerminal(int data){
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
        System.out.println();
    }

    public void reverse(){
        Node previous = null;
        Node current = head;
        Node next = null;

        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args){
        LinkedListDemo lld = new LinkedListDemo();

        lld.insertAtTerminal(3);
        lld.insertAtTerminal(5);
        lld.insertAtTerminal(93);
        lld.insertAtTerminal(53);
        lld.insertAtTerminal(37);

        lld.display();

        lld.reverse();
        lld.display();
    }
}
