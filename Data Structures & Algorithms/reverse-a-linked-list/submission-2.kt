/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
    var current = head
    var prevNode: ListNode? = null
    var nextNode: ListNode? = null

    while (current != null) {
        nextNode = current.next
        current.next = prevNode
        prevNode = current
        current = nextNode
    }
    return prevNode
}
}
