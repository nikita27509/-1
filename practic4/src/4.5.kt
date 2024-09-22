fun main()
{
    print("Введите число: ")
    val number = readLine()!!.toDouble()

    val a = when
    {
        number > 0 -> "Положительное"
        number < 0 -> "Отрицательное"
        else -> "Нулевое"
    }

    println("Число $number - $a")
}