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
    public ListNode mergeKLists(ListNode[] lists) {

    // Edge case
    if (lists == null || lists.length == 0) {
        return null;
    }

    // Min-heap based on node value
    PriorityQueue<ListNode> minHeap =
            new PriorityQueue<>((a, b) -> a.val - b.val);

    // Add first node of each list
    for (ListNode head : lists) {
        if (head != null) {
            minHeap.offer(head);
        }
    }

    // Dummy node to simplify list building
    ListNode dummy = new ListNode(0);
    ListNode current = dummy;

    while (!minHeap.isEmpty()) {
        ListNode smallestNode = minHeap.poll();
        current.next = smallestNode;
        current = current.next;

        // Push next node of the extracted list
        if (smallestNode.next != null) {
            minHeap.offer(smallestNode.next);
        }
    }

    return dummy.next;
}

}
