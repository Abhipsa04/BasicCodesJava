// Solved using two pointer method
public class Solution {
    public boolean hasCycle(ListNode head) {
        // Check that the head node given is not empty itself
        if(head == null) return false;
        
        // Initialize the two nodes
        ListNode slow = head; // Jumping one space
        ListNode fast = head.next; // Jumping two space
        
        while(slow != fast){
            // if we reach the end of the node, then that means there is no cycle
            if(fast == null || fast.next == null) return false;
            
            // If the above case is not triggered then proceed
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
