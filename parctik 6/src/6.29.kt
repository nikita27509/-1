fun main()
{
    val numbers = intArrayOf(1, 3, 5, 7, 9, 2, 4, 6, 8, 10)
    val median = findMedian(numbers)
    println("Медиана: $median")
}
fun findMedian(array: IntArray): Double
{
    val sortedArray = array.sortedArray()
    val middleIndex = sortedArray.size / 2
    return if (sortedArray.size % 2 == 0)
    {
        (sortedArray[middleIndex - 1] + sortedArray[middleIndex]).toDouble() / 2
    }
    else
    {
        sortedArray[middleIndex].toDouble()
    }
}