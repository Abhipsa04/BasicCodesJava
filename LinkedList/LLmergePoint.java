
/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method. 
      
    int countA=0;
    int countB=0;
    
    Node tempA=headA;
    Node tempB=headB;

    while(tempA!=null)
        {
        countA++;
        tempA=tempA.next;
    }
    
    
    while(tempB!=null)
        {
        countB++;
        tempB=tempB.next;
    }
    int diff=0;
    if(countA>countB)
        diff=countA-countB;
    else
        diff=countB-countA;
    tempA=headA;
    tempB=headB;
    if(countA>countB)
        {
         while(diff >0)
         {tempA=tempA.next;
         diff--;}
        
    }
    else
        {while(diff >0)
        { tempB=tempB.next;
          diff--;}
        
        
        }
    
    while(tempA!=null && tempB!=null)
    {
        
        tempA=tempA.next;
        tempB=tempB.next;
        if(tempA==tempB)
            return tempA.data;
        
    }
    return 0;
    

}
