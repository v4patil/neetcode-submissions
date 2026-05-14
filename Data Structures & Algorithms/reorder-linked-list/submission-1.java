/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
   public static void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode middleNode = middleNode(head);
        ListNode hs = reverseListFromMid(middleNode); 
        ListNode hf = head;
      
        while (hf != null && hs != null) {
            ListNode tmp = hf.next;
            hf.next = hs;
            hf = tmp;
            
            tmp = hs.next;
            hs.next = hf;
            hs = tmp;
        }
        if(hf != null){
            hf.next = null;
        }
    }
    
    public static ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;//mid
    }
    
    public static ListNode reverseListFromMid(ListNode midNode){
        ListNode prev = null;
        ListNode curr = midNode;
        ListNode next = curr.next;
        
        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;// return the last node from the original one
    }
    
}
