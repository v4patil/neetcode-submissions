/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
    if (head == null) return false

    var slow = head
    var fast = head.next

    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
        if (slow?.`val` == fast?.`val`) {
            return true;
        }
    }
    return false;
}
}
