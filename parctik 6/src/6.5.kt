fun main()
{
    val a = intArrayOf(5, 2, 8, 1, 9, 3, 2, 5)

    val b = a.distinct().toTypedArray()

    println("Уникальные элементы: ${b.joinToString(", ")}")
}