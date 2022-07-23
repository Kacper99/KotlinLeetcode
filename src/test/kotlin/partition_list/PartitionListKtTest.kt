package partition_list

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.LinkedList
import java.util.Queue

internal class PartitionListKtTest {

    @Test
    fun `test`() {
        val input : Queue<Int> = LinkedList(listOf(1,4,3,2,5,2))
        val head = buildNodeList(input)

        val output = partition(head, 3)

        val expectedOutput = LinkedList(listOf(1, 2, 2, 4, 3, 5))
        assertEquals(expectedOutput, toArray(output!!))
    }

    fun buildNodeList(input: Queue<Int>) : ListNode {
        val head = ListNode(input.poll())
        var prevNode = head
        while (input.isNotEmpty()) {
            val newNode = ListNode(input.poll())
            prevNode.next = newNode
            prevNode = newNode
        }
        return head
    }

    fun printNodeList(node: ListNode) {
        println(node.`val`)
        if (node.next != null) {
            printNodeList(node.next!!)
        }
    }

    fun toArray(node: ListNode) : List<Int> {
        var nnode : ListNode? = node
        var list = mutableListOf<Int>()
        while (nnode != null) {
            list.add(nnode.`val`)
            nnode = nnode.next
        }
        return LinkedList(list)
    }
}