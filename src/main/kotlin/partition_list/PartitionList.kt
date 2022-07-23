package partition_list

fun partition(head: ListNode?, x: Int): ListNode? {
    var currNode = head

    var leftHead = ListNode(0)
    var left = leftHead

    var rightHead = ListNode(0)
    var right = rightHead;

    while (currNode != null) {
        if (currNode.`val` < x) {
            left.next = currNode
            left = currNode
        } else {
            right.next = currNode
            right = currNode
        }

        currNode = currNode.next
    }

    left.next = rightHead.next
    right.next = null
    return leftHead.next
}

/** 3
 * V
 * 1 4 3 2 5 2 < left = 1, right = null, curr = 1
 *   V
 * 1 4 3 2 5 2 >= (store previous and child aka 1 and 4) left = 1, right = 4, curr = 4
 *     V
 * 1 4 3 2 5 2 >= (keep store of 1 and 4)
 *       V
 * 1 4 3 2 5 2 >= (1.next = 2, 2.next = 4)
 *         V
 * 1 2 4 3 5 2 >= (correct place do nothing)
 *           V
 * 1 2 4 3 5 2 < (2.next = 2, 2.next = 4)
 */


/** 3
 * V
 * 7 4 3 2 5 2 >=
 *   V
 * 7 4 3 2 5 2 >= (store previous and child aka 1 and 4)
 *     V
 * 7 4 3 2 5 2 >= (keep store of 1 and 4)
 *       V
 * 7 4 3 2 5 2 >= (1.next = 2, 2.next = 4)
 *         V
 * 7 2 4 3 5 2 >= (correct place do nothing)
 *           V
 * 7 2 4 3 5 2 < (2.next = 2, 2.next = 4)
 */