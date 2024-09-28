fun main()
{
    val a = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val b = 5

    val newArray = a.filter { it != b }.toIntArray()

    println("Измененный массив: ${newArray.joinToString(", ")}")
}