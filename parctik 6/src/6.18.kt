fun main() {
    val a = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    val groupSize = 5

    for (i in 0 until a.size step groupSize) {
        val group = a.sliceArray(i until minOf(i + groupSize, a.size))
        println("Группа ${i / groupSize + 1}: ${group.joinToString(", ")}")
    }
}