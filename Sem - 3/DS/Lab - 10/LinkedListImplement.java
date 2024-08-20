import java.util.Scanner;

public class LinkedListImplement {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int todo;
        while(true){
            System.out.println("Enter 1 : To insert a number at End of a LinkedList.");
            System.out.println("Enter 2 : To insert a number at First of a LinkedList.");
            System.out.println("Enter 3 : To Delete a number from End of a LinkedList.");
            System.out.println("Enter 4 : To Delete a number from First of a LinkedList.");
            System.out.println("Enter 5 : To Delete a number from Mid of a LinkedList.");
            System.out.println("Enter 6 : To Display a LinkedList.");
            System.out.println("Enter 7 : To End the program.");
            System.out.print("Enter what you want to do : ");
            todo = sc.nextInt();

            switch(todo){
                case 1 : 
                    System.out.print("Enter Number Which you want to insert :  ");
                    ll.insertAtEnd(sc.nextInt());
                    break;
                case 2 : 
                    System.out.print("Enter Number Which you want to insert :  ");
                    ll.insertAtFirst(sc.nextInt());
                    break;
                case 3 : 
                    ll.deleteLast();
                    break;
                case 4 : 
                    ll.deleteFirst();
                    break;
                case 5 : 
                    System.out.print("Enter index (staen from 1) Which you want to delete :  ");
                    ll.deleteAt(sc.nextInt());
                    break;
                case 6 :
                    System.out.print("Your LinkedList : ");
                    ll.display();
                    break;
                default : 
                    sc.close();
                    return;
            }

        }
    } 
}

class LinkedList {
    static class Node{
        int info;
        Node link;
        Node(int info){
            this.info = info;
            this.link = null;
        }
    }

    Node first;

    LinkedList(){
        first = null;
    }
    
    void insertAtFirst(int info){
        Node newNode = new Node(info);
        System.out.println("Added..");
        if(first == null){
            first = newNode;
            return;
        }
        newNode.link = first;
        first = newNode;
    }

    void insertAtEnd(int info){
        Node newNode = new Node(info);
        System.out.println("Added..");
        if(first == null){
            first = newNode;
            return;
        }
        Node toEnd = first;
        while(toEnd.link != null){
            toEnd = toEnd.link;
        }
        toEnd.link = newNode;
    }

    void deleteFirst(){
        if(first != null){
            first = first.link;
            System.out.println("Deleted..");
            return;
        }
        System.out.println("Empty LinkedList.");
    }

    void deleteLast(){
        if(first == null){
            System.out.println("Empty LinkedList.");
            return;
        }
        if(first.link == null){
            System.out.println("Deleted..");
            first = null;
            return;
        }
        Node toEnd = first;
        while(toEnd.link.link != null){
            toEnd = toEnd.link;
        }
        toEnd.link = null;
    }

    void deleteAt(int index){
        if(first == null){
            System.out.println("Empty LinkedList.");
            return;
        }
        Node toMid = first;
        for(int i = 1;i < index - 1;i++){
            if(toMid == null) {
                System.out.println("Index is not thier.");
                return;
            }
            toMid = toMid.link;
        }
        if(toMid.link == null){
            System.out.println("Index is not thier.");
            return;
        }
        toMid.link = toMid.link.link;
        System.out.println("Deleted..");
    }

    void display(){
        Node toEnd = first;
        while(toEnd != null){
            System.out.print(toEnd.info + " ");
            toEnd = toEnd.link;
        }
        if(toEnd == first){
            System.out.println("Empty LinkedList.");
        }
    }
    
}