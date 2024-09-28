fun main()
{
    println("Введите размер=")
    val size = readLine()!!.toInt()
    println("Введите элементы массива, разделяя их пробелами:")
    val input = readLine()!!.split(" ")
    val numbers = input.map { it.toInt() }.toIntArray()
    println("Введенный массив: ${numbers.joinToString(", ")}")
}