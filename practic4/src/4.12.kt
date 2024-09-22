fun main()
{
    print("Введите страну: ")
    val country = readLine()!!.lowercase()

    val nationality = when (country)
    {
        "сша" -> "американец"
        "Россия" -> "Россиянин"
        "Япония" -> "Японец"
        "Китай" -> "Китаец"
        "Корея" -> "Кореец"
        else -> "Неизвестная национальность"
    }

    println("Национальность: $nationality")
}