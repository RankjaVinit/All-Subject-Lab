class Node{
    int data;
    Node next;
    Node previous;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class CircularList{
    Node head = null;
    Node tail = null;
    public void insertAtFirst(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }

        else{
           newNode.next = head;
           head = newNode;
           tail.next = head;
        }

        // This code is without null
        // if(head == null){
        //     head = newNode;
        //     head.next = head;
        // }

        // Node temp = head;

        // while(temp.next != head){
        //     temp = temp.next;
        // }
        // newNode.next = head;
        // temp.next = newNode;
        // head = newNode;
    }

    public void insertAtLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }

        else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void insertAtPosition(int data){
        Node newNode = new Node(data);

        if(newNode.data < head.data){
            newNode.next = head;
            head = newNode;
            tail.next = head;
            return;
        }
        Node temp = head;

        while(newNode.data > temp.next.data && temp != tail){
            temp = temp.next;
        }

        if(newNode.data < temp.next.data){
            newNode.next = temp.next;
            temp.next = newNode;
        }

        if(temp == tail){
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void delete(int data){
        Node previous = null;

        if(head == null){
            System.out.println("Linked list is empty");
        }

        if (head.data == data) {
            if (head == tail) { // If the list contains only one node
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }
        Node temp = head;

        //We will try another method to delete to the node;

        do{
            previous = temp;
            temp = temp.next;

            if(temp.data == data){
                previous.next = temp.next;

                if(temp == tail){
                    tail = previous;
                }
                return;
            }
        }while(temp != head);

        // This is the first method to delete the node
        // while(temp.next.data != data && temp != null){
        //     temp = temp.next;
        // }

        // if(temp.next.data == data){
        //     temp.next = temp.next.next;
        // }

        // if(temp == null){
        //     System.out.println("There is no node available of data = "+data);
        // }
    }

    public void display(){
        Node temp = head;

        if(head != null){
            do{
                System.out.print(temp.data + " ");
                temp = temp.next;
            }while(temp != head);
            System.out.println();
        }

    }
}

public class CircularLinkedList{
    public static void main(String [] args){
        CircularList cl = new CircularList();
        // cl.insertAtFirst(2);
        // cl.insertAtFirst(5);
        // cl.insertAtFirst(3);
        // cl.insertAtFirst(9);
        // cl.insertAtFirst(15);

        cl.insertAtLast(2);
        cl.insertAtLast(5);
        cl.insertAtLast(9);
        cl.insertAtLast(77);
        cl.insertAtLast(98);

        // cl.delete(9);

        cl.insertAtPosition(1);

        cl.display();
    }
}