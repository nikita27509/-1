fun main()
{
    print("Введите первое число: ")
    val num1 = readLine()!!.toInt()

    print("Введите второе число: ")
    val num2 = readLine()!!.toInt()

    if (num1 % 2 != num2 % 2)
    {
        if (num1 % 2 == 1)
        {
            println("Нечетное число: $num1")
        } else {
            println("Нечетное число: $num2")
        }
    }
    else
    {
        println("Ошибка: числа должны иметь разную четность.")
    }
}