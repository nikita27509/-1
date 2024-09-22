fun main()
{
    print("Введите число: ")
    val num = readLine()!!.toInt()

    val sum = sumOfDigits(num)
    println("Сумма цифр числа $num: $sum")
}

fun sumOfDigits(num: Int): Int
{
    var sum = 0
    var n = num

    while (n > 0)
    {
        sum += n % 10
        n /= 10
    }
    return sum
}