class Split{
    Node head = null;
    int count = 0;
    public void insertAtEnd(int data){
       
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            head.next = head;
            return;
        }

        Node temp = head;

        while(temp.next != head){
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;
    }

    public void display(){
        Node temp = head;
        
        do{
            if(temp != null){
                count++;
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }while(temp != head);
        System.out.println();

        System.out.println("count = "+count);
    }

    public void splitList(){
        Node temp = head;
        
        for(int i = 1 ; i <= (count / 2) - 1 ; i++){
            // System.out.print(temp.data + " ");
            temp = temp.next;
        }
        Node second = temp.next;
        Node join = temp.next;
        

        for(int i = (count / 2) + 1; i < count ; i++){
            // System.out.print(second.data + " ");
            second = second.next;
        }
        temp.next = head;
        second.next = join;

        Node first = head;

        do{
            System.out.print(first.data + " ");
            first = first.next;
        }
        while(first != head);

        System.out.println();

        Node end = join;

        do{
            System.out.print(end.data + " ");
            end = end.next;
        }while(end != join);

    }
}

public class SplitCircular {
    public static void main(String[] args){
        Split s = new Split();

        for(int i = 1 ; i <= 10 ; i++){
            s.insertAtEnd(i);
        }
        s.display();

        s.splitList();
    }
}
