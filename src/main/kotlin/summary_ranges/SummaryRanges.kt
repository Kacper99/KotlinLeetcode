package summary_ranges

import kotlin.math.sign

fun summaryRanges(nums: IntArray): List<String> {

    if (nums.isEmpty()) return listOf()

    var ranges = mutableListOf<String>()
    var startRange = nums[0]

    for (i in 1 until nums.size) {
        if (nums[i] != nums[i - 1] + 1) {
            var endRange = nums[i - 1]
            if (startRange == endRange) {
                ranges.add("$startRange")
            } else {
                ranges.add("$startRange->$endRange")
            }
            startRange = nums[i]
        }
    }
    var endRange = nums[nums.size - 1]
    if (startRange == endRange) {
        ranges.add("$startRange")
    } else {
        ranges.add("$startRange->$endRange")
    }
    return ranges
}