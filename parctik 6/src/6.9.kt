fun main()
{
    val a = intArrayOf(1, 2, 3, 4, 5)
    val b = a.copyOf()
    println("Новый массив: ${b.joinToString(", ")}")
}