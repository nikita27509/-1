fun main()
{
    print("Введите натуральное число: ")
    val number = readLine()!!.toInt()

    if (number % 2 == 0) {
        println("$number - четное число.")
    }
    else
    {
        println("$number - нечетное число.")
    }

    if (number % 10 == 7)
    {
        println("$number оканчивается цифрой 7.")
    }
    else
    {
        println("$number не оканчивается цифрой 7.")
    }
}