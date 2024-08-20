import java.util.Scanner;

class SinglyLinkedList{

    Node head = null;

    public void insertAtLast(int val){
        Node newNode = new Node(val);

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

    public int countNode(){
        int count = 0;

        Node temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        return count;

    }

    public static boolean checkForSame(SinglyLinkedList l1 , SinglyLinkedList l2){

        if(l1.head == null && l2.head == null){
            return true;
        }

        if(l1.head == null || l2.head == null){
            return false;
        }

        int size1 = l1.countNode();
        int size2 = l2.countNode();

        if(size1 != size2){
            return false;
        }

        Node temp1 = l1.head;
        Node temp2 = l2.head;

        while(temp1 != null && temp2 != null){
            if(temp1.data != temp2.data){
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return true;

    }

}

public class CheckSame {
    public static void main(String[] args){
        SinglyLinkedList l1 = new SinglyLinkedList();
        SinglyLinkedList l2 = new SinglyLinkedList();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements for 1st linkedList if you want to get out from the loop please Enter -1");

        int x;

        while(true){
            x = sc.nextInt();
            if(x == -1){
                break;
            }
            l1.insertAtLast(x);
        }

        System.out.println("Enter the elements for 2nd linkedList if you want to get out from the loop please enter -1");
        int y;

        while(true){
            y = sc.nextInt();
            if(y == -1){
                break;
            }
            l2.insertAtLast(y);
        }

        if(SinglyLinkedList.checkForSame(l1 , l2)){
            System.out.println("Both LinkedList are same");
        }

        else{
            System.out.println("Both LinkedList are not same");
        }
    }
}
