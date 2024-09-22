fun main()
{
    print("Введите первое число (большее): ")
    val num1 = readLine()!!.toInt()

    print("Введите второе число (меньшее): ")
    val num2 = readLine()!!.toInt()

    if (num1 % num2 == 0)
    {
        println("$num1 кратно $num2")
    }
    else
    {
        val remainder = num1 % num2
        println("$num1 не кратно $num2. Остаток от деления: $remainder")
    }
}