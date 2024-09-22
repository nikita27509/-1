fun main()
{
    while (true)
    {
        print("Введите первую цифру: ")
        val num1 = readLine()!!.toInt()

        print("Введите вторую цифру: ")
        val num2 = readLine()!!.toInt()

        print("Выберите операцию (+ или *): ")
        val operation = readLine()!!

        if (operation == "+")
        {
            println("$num1 + $num2 = ${num1 + num2}")
        } else if (operation == "*")
        {
            println("$num1 * $num2 = ${num1 * num2}")
        } else if (operation == "стоп")
        {
            println("Программа завершена.")
            break
        }
        else
        {
            println("Неверная операция.")
        }
    }
}