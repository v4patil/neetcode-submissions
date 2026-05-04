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
      public static ListNode reverseList(ListNode head) {
        if(head == null){
          return null;          
        }
        ListNode previousNode = null;
        ListNode nextNode = null;

        while(head.next != null){
            nextNode = head.next;
            head.next = previousNode;
            previousNode = head;
            head = nextNode;
        }
        head.next = previousNode;
        return head;
    }
}
