fun main()
{
    val numbers = arrayOf(23, 15, 87, 42, 66)

    println("Исходный массив: ${numbers.joinToString(", ")}")

    for (i in 0 until numbers.size - 1) {
        for (j in 0 until numbers.size - i - 1) {
            if (numbers[j] > numbers[j + 1]) {
                val temp = numbers[j]
                numbers[j] = numbers[j + 1]
                numbers[j + 1] = temp
            }
        }
    }

    println("Отсортированный массив: ${numbers.joinToString(", ")}")
}