fun main()
{
    print("Введите двузначное число: ")
    val number = readLine()!!.toInt()

    val firstDigit = number / 10
    val secondDigit = number % 10

    if (firstDigit > secondDigit)
    {
        println("Первая цифра ($firstDigit) больше второй цифры ($secondDigit)")
    }
    else if (firstDigit < secondDigit)
    {
        println("Вторая цифра ($secondDigit) больше первой цифры ($firstDigit)")
    }
    else
    {
        println("Цифры одинаковые.")
    }
}