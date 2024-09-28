fun main()
{
    val numbers = intArrayOf(1, 1, 2, 2, 2, 1, 1, 1, 3, 3)

    val (maxElement, maxLength) = findMaxSequence(numbers)

    println("Максимальная последовательность: $maxElement, длина: $maxLength")
}

fun findMaxSequence(array: IntArray): Pair<Int, Int>
{
    if (array.isEmpty()) return Pair(0, 0)

    var maxElement = array[0]
    var maxLength = 1
    var currentElement = array[0]
    var currentLength = 1

    for (i in 1 until array.size)
    {
        if (array[i] == currentElement)
        {
            currentLength++
        }
        else
        {
            currentElement = array[i]
            currentLength = 1
        }
        if (currentLength > maxLength)
        {
            maxLength = currentLength
            maxElement = currentElement
        }
    }

    return Pair(maxElement, maxLength)
}