fun main()
{
    print("Введите N: ")
    val n = readLine()!!.toInt()

    var sum = 0
    var summ = 0

    for (i in 1..n)
    {
        if (i % 2 == 0)
        {
            sum += i
        } else {
            summ += i
        }
    }

    println("Сумма четных чисел от 1 до $n: $sum")
    println("Сумма нечетных чисел от 1 до $n: $summ")
}
