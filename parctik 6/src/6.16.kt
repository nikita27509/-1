fun main() {
    val a = intArrayOf(1, 2, 3)
    val b = intArrayOf(4, 5, 6)
    val combinedArray = a + b
    println("Объединенный массив: ${combinedArray.joinToString(", ")}")
}