fun main()
{
    print("Введите количество чисел (N): ")
    val n = readLine()!!.toInt()
    val numbers = IntArray(n)
    println("Введите $n чисел:")
    for (i in 0 until n)
    {
        numbers[i] = readLine()!!.toInt()
    }
    for (i in 0 until numbers.size - 1)
    {
        var minIndex = i
        for (j in i + 1 until numbers.size)
        {
            if (numbers[j] < numbers[minIndex])
            {
                minIndex = j
            }
        }
        val temp = numbers[i]
        numbers[i] = numbers[minIndex]
        numbers[minIndex] = temp
    }
    println("Отсортированные числа:")
    for (number in numbers)
    {
        print("$number ")
    }
}