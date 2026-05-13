/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var dummyHead = ListNode(-1)
        var current = dummyHead

        var tempList1 = list1
        var tempList2 = list2

    while(tempList1 != null && tempList2 != null) {
        if(tempList1.`val` <= tempList2.`val`){
            current.next = tempList1
            tempList1 = tempList1.next
        }else{
            current.next = tempList2
            tempList2 = tempList2.next
        }
        current = current.next!!
    }
    current.next = tempList1 ?: tempList2
    return dummyHead.next
}
}
