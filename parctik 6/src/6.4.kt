fun main ()
{
    val numbers = intArrayOf(5, 2, 8, 1, 9, 3)
    // Сортировка пузырьком
    for (i in 0 until numbers.size - 1)
    {
        for (j in 0 until numbers.size - i - 1)
        {
            if (numbers[j] > numbers[j + 1])
            {
                // Обмен элементов
                val temp = numbers[j]
                numbers[j] = numbers[j + 1]
                numbers[j + 1] = temp
            }
        }
    }
    println("Отсортированный массив: ${numbers.joinToString(", ")}")
}