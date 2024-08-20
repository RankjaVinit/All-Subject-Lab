class Duplicate{
    Node head = null;
    int count = 0;

    public void insertAtEnd(int data){
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

    public void count(){
        Node temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }
    }

    public void removeDuplicate(){
        if(head == null){
            System.out.println("There is no node available");
            return;
        }
        Node loop = head;
        for(int i = 0; i < count ; i++){
            Node temp = null;

            Node dummy = head;
            temp.next = head;

            while(dummy.next != null){
                if(loop.data == dummy.next.data){
                    dummy.next = dummy.next.next;
                }
            }
            loop = loop.next;
        }
        Node pr = head;
        while(pr != null){
            System.out.print(pr.data + " ");
            pr = pr.next;
        }
    }
    
}


public class DuplicateWithoutSort {
    public static void main(String[] args){
        Duplicate ll = new Duplicate();

        ll.insertAtEnd(12);
        ll.insertAtEnd(23);
        ll.insertAtEnd(34);
        ll.insertAtEnd(23);
        ll.insertAtEnd(12);
        ll.insertAtEnd(55);
        ll.insertAtEnd(78);

        System.out.println("Disllaying the list before removing duplicate");
        ll.display();

        System.out.println("Displaying the list after removing the duplicate");
        ll.removeDuplicate();
    }
}
