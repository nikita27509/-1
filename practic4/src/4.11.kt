fun main()
{
    print("Введите группу крови (A, B, AB, O): ")
    val Group = readLine()!!.uppercase()

    val compatibleGroups = when (Group)
    {
        "A" -> "A, O"
        "B" -> "B, O"
        "AB" -> "A, B, AB, O"
        "O" -> "O"
        else -> "Некорректная группа крови"
    }

    println("Совместимые группы крови: $compatibleGroups")
}