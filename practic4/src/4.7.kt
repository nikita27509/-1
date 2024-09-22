fun main()
{
    print("Введите строку: ")
    val a = readLine()!!
    val length = when (a.length)
    {
        0 -> "Пустая строка"
        1 -> "Строка содержит 1 символ"
        else -> "Строка содержит ${a.length} символов"
    }
    println(length)
}