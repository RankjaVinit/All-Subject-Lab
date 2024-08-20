import java.util.Scanner;

class Swap{
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
            count++;
        }
        System.out.println();
    }

    public void swapNode(int k){

        if(head == null ){
            System.out.println("There is no node available");
            return;
        }

        if(k <= 0 || k > count){
            System.out.println("Invalid k value");
            return;
        }

        Node first = head;
        for(int i = 0 ; i < k - 1 ; i++){
            first = first.next;
        }
        Node last = head;

        for(int i = 0 ; i < count - k ; i++){
            last = last.next;
        }

        int temp = first.data;
        first.data = last.data;
        last.data = temp;

    }
}

public class SwapNode {
    public static void main(String[] args){
        Swap ll = new Swap();

        ll.insertAtLast(3);
        ll.insertAtLast(23);
        ll.insertAtLast(39);
        ll.insertAtLast(55);
        ll.insertAtLast(77);

        System.out.println("Printing normal list");
        ll.display();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to replace = ");
        int k = sc.nextInt();

        ll.swapNode(k);
        System.out.println("Printing the list after swap the node");
        ll.display();
    }
}
