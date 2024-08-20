public class SinglyCircularlyLinkedList {

    
    public static void main(String[] Args){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        n1.link = n2;
        Node n3 = new Node(3);
        n2.link = n3;
        Node n4 = new Node(4);
        n3.link = n4;
        Node n5 = new Node(4);
        n4.link = n5;
        display(n1);
        n5.link = n1;
        System.out.println("Length = " + countNode(n1));
    }

    static int countNode(Node first){
        Node fast = first;
        Node slow = first;
        int count = 0;
        while(fast != null && fast.link != null){
            fast = fast.link.link;
            slow = slow.link;
            count++;
            if(slow == fast) break;
        }
        return count;
    }

    static void display(Node first){
        while(first != null){
            System.out.print(first.info + " ");
            first = first.link;
        }
    }
}

class Node{
    int info;
    Node link;
    Node(int info){
        this.info = info;
        this.link = null;
    }
}
