class Node{
    int data;
    Node next;
    Node previous;

    public Node(int data){
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}

class DoublyLinkedList{
    public Node head = null;
    public void insertAtEnd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            head.next = null;
            head.previous = null;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.previous = temp;
        temp = newNode;
        temp.next = null;
    }

    public void delete(){
        Node temp = head;

        while(temp != null && temp.next != null){
            temp.next = temp.next.next;
            if(temp.next != null){
                temp.next.previous = temp;
            }
           
            temp = temp.next;
        }
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class DeleteAlternate{
    public static void main(String[] args){
        DoublyLinkedList dl = new DoublyLinkedList();

        // dl.insertAtEnd(2);
        // dl.insertAtEnd(5);
        // dl.insertAtEnd(7);
        // dl.insertAtEnd(1);
        // dl.insertAtEnd(3);
        // dl.insertAtEnd(12);
        // dl.insertAtEnd(15);
        // dl.insertAtEnd(98);
        // dl.insertAtEnd(1);
        

        for(int i = 0 ;i < 270;i++){
            dl.insertAtEnd(i);
        }

        System.out.println("Printing the list before the deleting the node");
        dl.display();

        dl.delete();
        System.out.println("Printing the list after the deleting alternate node");
        dl.display();
    }
}