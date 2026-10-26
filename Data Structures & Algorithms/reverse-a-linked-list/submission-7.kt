/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        if(head == null) return null
        if(head.next == null) return head

        var previous: ListNode? = null
        var current = head

        while(current != null){
            val tempNext = current.next
            current.next = previous
            previous = current
            current = tempNext
        }
        return previous
    }
}
