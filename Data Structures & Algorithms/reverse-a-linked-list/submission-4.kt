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
        val nextNode = currentHead.next
        currentHead.next = previousHead
        previousHead = currentHead
        currentHead = nextNode
    }
    return previousHead
}
}
