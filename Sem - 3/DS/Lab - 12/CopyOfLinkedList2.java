class LinkedListCopy{
    Node head = null;
    Node begin = null;

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

        System.out.println("Printing the original list = ");

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

        Node dummy = begin;

        System.out.println("printing the copied list = ");

        while(dummy != null){
            System.out.print(dummy.data + " ");
            dummy = dummy.next;
        }
        System.out.println();
    }

    public void copyOfLink(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node save = head;
        begin = new Node(save.data);
        Node pred = begin;

        save = save.next;

        while(save != null){
            Node newNode = new Node(save.data);
            pred.next = newNode;
            pred = newNode;
            save = save.next;
        }
    }
}

public class CopyOfLinkedList2 {
    public static void main(String[] args){
        LinkedListCopy ll = new LinkedListCopy();

        ll.insertAtLast(2);
        ll.insertAtLast(5);
        ll.insertAtLast(8);
        ll.insertAtLast(55);
        ll.insertAtLast(76);

        ll.copyOfLink();
        ll.display();

    }
}
