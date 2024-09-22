fun main()
{
    print("Введите тип пищи (мясо, рыба, овощи, макароны): ")
    val foodType = readLine()!!.lowercase()

    val cookingTime = when (foodType)
    {
        "курица" -> 25
        "рис" -> 15
        "жаренные яйца" -> 3
        "макароны" -> 10
        else -> -1
    }

    if (cookingTime != -1)
    {
        println("Примерное время приготовления: $cookingTime минут.")
    }
    else
    {
        println("Неизвестный тип пищи.")
    }
}