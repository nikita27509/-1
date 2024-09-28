fun main()
{
    val a = IntArray(10) { it * 2 + 1 }
    println("Арифметическая прогрессия: ${a.joinToString(", ")}")
}