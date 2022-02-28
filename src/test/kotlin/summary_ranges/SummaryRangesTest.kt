package summary_ranges

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SummaryRangesTest {

    @Test
    fun `List of integers should return ranges`() {
        val input = intArrayOf(0, 1, 2, 4, 5, 7)
        val expected = listOf<String>("0->2", "4->5", "7")
        assertEquals(expected, summaryRanges(input))
    }

    @Test
    fun `empty input should return empty output`() {
        assertEquals(listOf<String>(), summaryRanges(intArrayOf()))
    }

    fun `single item array should return just number in output`() {
        assertEquals(listOf("-1"), summaryRanges(intArrayOf(-1)))
    }
}