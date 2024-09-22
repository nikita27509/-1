fun main()
{
    print("Введите число= ")
    val n = readLine()!!.toInt()

    if (n < 0)
    {
        println("Факториал не определен для отрицательных чисел.")
    } else {
        val factorial = factorial(n)
        println("Факториал $n равен: $factorial")
    }
}

fun factorial(n: Int): Long {
    if (n == 0)
    {
        return 1
    } else
    {
        return n * factorial(n - 1)
    }
}