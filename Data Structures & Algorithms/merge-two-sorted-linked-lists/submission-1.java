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
   public ListNode mergeTwoLists(ListNode firstList, ListNode secondList) {

    // Dummy node to simplify edge cases
    ListNode dummyHead = new ListNode(-1);
    ListNode current = dummyHead;

    while (firstList != null && secondList != null) {
        if (firstList.val <= secondList.val) {
            current.next = firstList;
            firstList = firstList.next;
        } else {
            current.next = secondList;
            secondList = secondList.next;
        }
        current = current.next;
    }

    // Attach the remaining nodes
    current.next = (firstList != null) ? firstList : secondList;

    return dummyHead.next;
}

}