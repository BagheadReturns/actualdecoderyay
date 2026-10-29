class Solution(
    val id: Int,
    val value: String,
    val previous: Int?,
    val method: String,
    val steps: MutableList<String> = mutableListOf()
) {
    fun showInfo() {
        println("Solution #$id")
        println("Value: $value")
        println("Method: $method")
        println("Previous: ${previous ?: "Original"}")
    }

    fun showSteps() {
        println("Decode chain for #$id:")
        steps.forEachIndexed { index, step ->
            println("${index + 1}. $step")
        }
    }

}