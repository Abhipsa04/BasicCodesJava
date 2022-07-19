import  java.util.*;
class LinkedList{
    Node head;
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
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next=newNode;
    }
    public void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head ;
        head = newNode;
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("Linked List Empty");
            return;
        }
        head = head.next;
        System.out.println("Deleted First");
        
    }
    public void deleteLast(){
     if(head==null){
            System.out.println("Linked List Empty");
            return;
        }
      if(head.next==null){
          head = head.next;
          System.out.println("Deleted Last");
          return;
      }
      Node temp = head;
      Node prev = null;
      while(temp.next!=null){
          prev = temp;
          temp = temp.next;
      }
      prev.next=null;
      System.out.println("Deleted Last");
    }
    public void display(){
        Node node = head;
        while(node!=null){
            System.out.print(node.data+"->");
            node = node.next;
        }
        System.out.println();
    }
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		LinkedList l1 = new LinkedList();
		l1.insertLast(5);
		l1.insertFirst(1);
		l1.insertLast(4);
		l1.insertLast(3);
		l1.display();
		l1.deleteLast();
		l1.display();
		l1.deleteFirst();
		l1.display();
	}
}
