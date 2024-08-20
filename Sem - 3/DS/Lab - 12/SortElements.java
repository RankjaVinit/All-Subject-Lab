class SortLinkedList{
    Node head = null;
    int count = 0;

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
            count = count + 1;
        }
        System.out.println();
    }

    public void sort(){

        if(head == null || head.next == null){
            return;
        }

        for(int i = 0 ; i < count - 1 ; i++){
            Node temp = head;
            Node after = head.next;

            for(int j = 0 ; j < count - 1 - i ; j++){
            if(temp.data > after.data){
                int ter = temp.data;
                temp.data = after.data;
                after.data = ter;
            }
            temp = after;
            after = after.next;
        }
    }
    }
}

public class SortElements {
    public static void main(String[] args){
        SortLinkedList ll = new SortLinkedList();

        ll.insertAtLast(12);
        ll.insertAtLast(98);
        ll.insertAtLast(75);
        ll.insertAtLast(9);
        ll.insertAtLast(66);

        ll.display();

        ll.sort();
        System.out.println("Displaying linked list after sorting the linkedlist");
        ll.display();
    }
}
