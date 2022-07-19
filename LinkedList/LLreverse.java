import  java.util.*;
class LinkedList{
    Node head;
    int size = 0;
    class Node{
        
        int data;
        Node next;
        Node(int x){
            this.data=x;
            next = null;
        }
    }
    
    public void insertLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            size++;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next=newNode;
        size++;
    }
    public void reverseLL(){
        Node nm1 = null;
        Node  n = this.head;
        Node np1 = n;
        while(n.next!=null){
            np1 = np1.next;
            n.next = nm1;
            nm1 = n;
            n = np1;
        }
        n.next=nm1;
        head = n;
        System.out.println("Reversed Linked List: ");
    }
    public void display(){
        Node node = head;
        while(node!=null){
            System.out.print(node.data+"->");
            node = node.next;
        }
        System.out.println();
        //System.out.println("Size is "+this.size);
    }
}

public class Main
{
	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		l1.insertLast(5);
		l1.insertLast(4);
		l1.insertLast(3);
		l1.insertLast(2);
		l1.display();
	    l1.reverseLL();
	    l1.display();

	}
}
