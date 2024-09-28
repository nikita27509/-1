fun main()
    {
        val a = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        var b = 0

        for (number in a)
        {
            if (number % 2 == 0) {
                b += number
            }
        }

        println("Сумма четных чисел: $b")
    }