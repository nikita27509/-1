fun main()
{
    print("Введите число: ")
    val num = readLine()!!.toInt()

    if (isPrime(num))
    {
        println("$num - простое число.")
    }
    else
    {
        println("$num - не простое число.")
    }
}

fun isPrime(num: Int): Boolean
{
    if (num <= 1)
    {
        return false
    }
    for (i in 2..Math.sqrt(num.toDouble()).toInt())
    {
        if (num % i == 0)
        {
            return false
        }
    }
    return true
}