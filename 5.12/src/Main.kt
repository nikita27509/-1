fun main()
{
    print("Введите начальное число: ")
    val start = readLine()!!.toInt()

    print("Введите шаг: ")
    val step = readLine()!!.toInt()

    print("Введите количество элементов: ")
    val count = readLine()!!.toInt()

    generateSequence(start, step, count)
}

fun generateSequence(start: Int, step: Int, count: Int)
{
    var current = start
    for (i in 1..count)
    {
        print("$current ")
        current += step
    }
}