fun main()
{
    print("Введите время суток (часы в формате 0-23): ")
    val hour = readLine()!!.toInt()

    val time = when (hour)
    {
        in 0..5 -> "Ночь"
        in 6..11 -> "Утро"
        in 12..17 -> "День"
        in 18..23 -> "Вечер"
        else -> "Некорректное время"
    }

    println("Время суток: $time")
}