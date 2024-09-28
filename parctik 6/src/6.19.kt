fun main()
{
    val a = intArrayOf(1, 6, 5, 12, 9)
    val b = intArrayOf(7, 4, 13, 8, 14)

    val mergedArray = a.plus(b).sortedArray()

    println("Объединенный отсортированный массив: ${mergedArray.joinToString(", ")}")
}