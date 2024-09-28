fun main()
{
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val evenNumbers = mutableListOf<Int>()
    val oddNumbers = mutableListOf<Int>()

    for (number in numbers)
    {
        if (number % 2 == 0)
        {
            evenNumbers.add(number)
        } else {
            oddNumbers.add(number)
        }
    }

    println("Четные числа: ${evenNumbers.joinToString(", ")}")
    println("Нечетные числа: ${oddNumbers.joinToString(", ")}")
}