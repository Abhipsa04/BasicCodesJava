// "static void main" must be defined in a public 
import java.util.*;
public class Dll{
    Node head;
    public void insertFirst(int val){
    Node node = new Node(val);
    System.out.println(node.data);

   node.next=head;
    //System.out.println(node.next.data);
   node.prev = null;
  if(head!=null){
   head.prev=node;   
  }
   
   head = node;
   System.out.println("newhead = "+node.data);
    }
    public void insertLast(int val){
        Node temp = new Node(val);
        Node node = head;
        temp.next=null;
        if(head==null){
            head = temp;
           // temp.next= null;
            temp.prev=null;
            temp = head;
            return;
        }
        while(node.next!=null){
            node = node.next;
 }
        node.next = temp;
        temp.prev=node;
        //temp.next = null;
        return;
        
    }
    public Node find(int val){
        Node node = head;
        while(node!=null){
            if(node.data==val){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void insertAfter(int aft , int val){
     Node node = new Node(val);
     Node i = find(aft);
     if(i==null){
         System.out.println("No such elements present Cant insert");
         return;
     }
    if(i.next!=null){
        i.next.prev=node;
    }
    node.next = i.next;
    node.prev=i;
    i.next = node;
    return;
    
    }
    public void display(){
        
        Node node = head;
        Node last = null;
        //System.out.println(node.data);
        while(node!=null){
            System.out.println(node.data+"-->"+" ");
            last = node;
            node = node.next;
            
        }
        
        System.out.println("\n Print Backwards");
        while (last!=null){
        System.out.println(last.data+" <--");
        last = last.prev;
        }
        
}
 class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            this.data = d;
        }
        
    }

public static void main(String[] args){
    Dll dli = new Dll();
    dli.insertFirst(3);
    dli.insertFirst(2);
    dli.insertFirst(1);
    dli.insertFirst(0);
    dli.insertLast(4);
    dli.insertLast(5);
    dli.insertLast(6);
    dli.insertAfter(8,30);
    dli.display();
    
}
}
