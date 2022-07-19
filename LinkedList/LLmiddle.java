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
    public int midNode(){
        Node p1 = this.head;
        Node p2 = this.head;
        while(p2.next!=null && p2.next.next!=null){
            p1=p1.next;
            p2=p2.next.next;
        }
        
        return p1.data;
    }
    public void display(){
        Node node = head;
        while(node!=null){
            System.out.print(node.data+"->");
            node = node.next;
        }
        System.out.println();
        System.out.println("Size is "+this.size);
    }
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		LinkedList l1 = new LinkedList();
		l1.insertLast(5);
		l1.insertLast(4);
		l1.insertLast(3);
		l1.insertLast(2);
		l1.display();
	    System.out.println("Middle Node is : "+l1.midNode());	

	}
}
