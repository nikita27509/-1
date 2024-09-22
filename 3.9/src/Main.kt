fun main()
{
    print("Введите m: ")
    val m = readLine()!!.toInt()

    print("Введите n: ")
    val n = readLine()!!.toInt()

    if (m % n == 0)
    {
        println("Частное от деления: ${m / n}")
    }
    else
    {
        println("$m на $n нацело не делится.")
    }
}