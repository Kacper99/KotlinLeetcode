package summary_ranges

fun summaryRanges(nums: IntArray): List<String> {

    if (nums.isEmpty()) return listOf()

    var ranges = mutableListOf<String>()
    var startRange = nums[0]

    for (i in 0 until nums.size) {
        if (i == nums.size - 1 || nums[i] + 1 != nums[i + 1]) {
            if (startRange == nums[i]) {
                ranges.add("$startRange")
            } else {
                ranges.add("$startRange->${nums[i]}")
            }
            if (i != nums.size - 1) {
                startRange = nums[i + 1]
            }
        }
    }
    return ranges
}