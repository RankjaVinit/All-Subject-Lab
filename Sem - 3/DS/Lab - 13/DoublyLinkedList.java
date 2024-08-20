class DoublyList{

    class Node{
        int data;
        Node next;
        Node previous;
    
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void insertAtFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            head.next = null;
            head.previous = null;
            return;
        }

        newNode.next = head;
        head = newNode;
        head.previous = null;

    }

    public void insertAtLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            head.previous = null;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.previous = temp;
    }

    public void insertAtPosition(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            head.previous = null;
            head.next = null;
            return;
        }

        if(newNode.data < head.data){
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
            head.previous = null;
            return;
        }

        Node temp = head;

        while( temp.next != null && newNode.data > temp.next.data){
            temp = temp.next;
        }

        newNode.next = temp.next;
        newNode.previous = temp;
        if(temp.next != null){
            temp.next.previous = newNode;
        }
        temp.next = newNode;
    }

    public void delete(int data){

        if(head == null){
            System.out.println("There is no node available");
            return;
        }

        if (head.data == data) {
            if (head.next == null) { // If there's only one node in the list
                head = null;
            } else {
                head = head.next;
                head.previous = null;
            }
            return;
        }
        
        Node temp = head;

        while(temp != null && temp.data != data){
            temp = temp.next;
        }

        if(temp == null){
            return;
        }

        if(temp.next == null){
            temp.previous.next = null;
            return;
        }

        temp.previous.next = temp.next;
        temp.next.previous = temp.previous;
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

public class DoublyLinkedList {
    public static void main(String[] args){
        DoublyList dl = new DoublyList();
        // dl.insertAtFirst(2);
        // dl.insertAtFirst(7);
        // dl.insertAtFirst(5);
        // dl.insertAtFirst(67);
        // dl.insertAtFirst(93);

        dl.insertAtLast(2);
        dl.insertAtLast(7);
        dl.insertAtLast(13);
        dl.insertAtLast(67);
        dl.insertAtLast(93);

        dl.delete(67);

        dl.display();
    }
}
