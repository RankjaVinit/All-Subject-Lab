public class NodeDemo{
    static class Node{
        int info;
        Node link;
        Node(int info){
            this.info = info;
            this.link = null;
        }
    }

    public static void display(Node first){
        while(first != null){
            System.out.print(first.info + " ");
            first = first.link;
        }
    }

    public static void main(String[] Args){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        n1.link = n2;
        Node n3 = new Node(3);
        n2.link = n3;
        Node n4 = new Node(3);
        n3.link = n4;
        Node n5 = new Node(3);
        n4.link = n5;
        display(n1);
    } 
} 