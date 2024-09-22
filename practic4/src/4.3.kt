fun main()
{
    print("Введите числовую оценку (1-5): ")
    val a = readLine()!!.toInt()

    val b = when
    {
        a >= 5 -> "5"
        a >= 4 -> "4"
        a >= 3 -> "3"
        a >= 2 -> "2"
        else -> "неуд."
    }

    println("Оценка: $b")
}