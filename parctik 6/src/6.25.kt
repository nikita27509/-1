fun main()
{
    val a = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val searchElement = 5

    val isFound = a.any { it == searchElement }

    println("Элемент $searchElement ${if (isFound) "найден" else "не найден"} в массиве")
}