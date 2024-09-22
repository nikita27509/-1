fun main()
{
    print("Введите количество чисел Фибоначчи: ")
    val n = readLine()!!.toInt()

    if (n <= 0)
    {
        println("Количество чисел должно быть больше 0.")
    }
    else
    {
        println("Первые $n чисел Фибоначчи:")
        generateFibonacci(n)
    }
}

fun generateFibonacci(n: Int)
{
    var a = 0
    var b = 1
    for (i in 1..n)
    {
        print("$a ")
        val temp = a + b
        a = b
        b = temp
    }
}