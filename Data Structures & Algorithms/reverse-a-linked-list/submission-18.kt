/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
   fun reverseList(head: ListNode?): ListNode? {
    var currentHead = head
    var previousHead : ListNode? = null

    while(currentHead != null){
        val nextHead = currentHead.next
        currentHead.next = previousHead
        previousHead = currentHead
        currentHead = nextHead
    }
    return previousHead
}
}
