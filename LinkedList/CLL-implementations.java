import java.util.*;
class CLL{
    Node head;
    Node tail;
    public CLL(){
        this.head=null;
        this.tail= null;
    }
public void insertLast(int val){
    Node node  = new Node(val);
    if(head==null){
        head = node;
        tail = node;
        node = head;
        node = tail;
        tail.next=head;
        return;
    }
    //Node last = head;
    //while(last.next!=head){
       // last = last.next;
   // }//
    //while(tail!=null)
    tail.next = node;
    node.next = head;
    tail = node;
    return;
    
}
public void insertFirst(int val){
    Node node  = new Node(val);
    if(head==null){
        head = node;
        tail = node;
        node = head;
        node = tail;
        tail.next=head;
        return;
    }
    //Node last = head;
    //while(last.next!=head){
       // last = last.next;
   // }//
    //while(tail!=null)
    tail.next = node;
    node.next = head;
    head= node;
    return;
    
}
    class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
        }
    }
public void display(){
    Node temp = head;
   /* while(temp.next!= head){
         System.out.println(temp.data+" ");
        temp = temp.next;
    }
    System.out.println(temp.data+" ");*/
    if(head!=null){
        do{
            System.out.println(temp.data+" -->");
            temp = temp.next;
        }while (temp!=head);
    }
    
} 
public void deleteVal(int val){
    Node node = head;
    Node prev=null;
    if(node == null){
        return;
    }
    if(node.data== val){//if head has to be deleted
        head = head.next;
        tail.next = head;
        return;
    }
    while(node.data!=val){
        prev = node;
        node = node.next;
        
    }
   // System.out.println(node.data);
   // System.out.println(prev.data);
    prev.next = node.next;
    if(node.next==head){// if tail has to be deleted
       prev.next=head;
        prev = tail;
        return;
    }
  /** as per video**
      Node node = head;
    Node prev=null;
    if(node == null){
        return;
    }
    if(node.data== val){
        head = head.next;
        tail.next = head;
        return;
    }
    do{
    Node n = node.next;
     if(n.val==val){
     node.next=n.next;
     break;
     }
     node = node.next;
    
    }while(node!=head);*/
    
    
}
    
    
    
    
    
    
    
    
    
    
    
    
public static void main(String[] args){

    CLL cli = new CLL();
    cli.insertFirst(3);
    cli.insertFirst(2);
    cli.insertFirst(1);
    cli.insertFirst(0);
    cli.insertLast(4);
    cli.insertLast(5);
    cli.insertLast(6);
    cli.deleteVal(3);
    //cli.insertAfter(8,30);
    cli.display();
    
    }
}
