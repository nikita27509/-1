fun main() {
    print("Введите начальное число: ")
    val start = readLine()!!.toInt()

    print("Введите конечное число: ")
    val end = readLine()!!.toInt()

    println("Простые числа в диапазоне от $start до $end:")
    for (i in start..end)
    {
        if (isPrime(i))
        {
            print("$i ")
        }
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