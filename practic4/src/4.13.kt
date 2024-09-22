fun main()
{
    print("Введите код ошибки (100, 200, 300): ")
    val error = readLine()!!.toInt()

    val Message = when (error)
    {
        100 -> "Ошибка сети"
        200 -> "Ошибка сервера"
        300 -> "Ошибка базы данных"
        else -> "Неизвестная ошибка"
    }

    println("Сообщение об ошибке: $Message")
}