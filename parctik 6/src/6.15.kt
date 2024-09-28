fun main()
{
    val a = intArrayOf(1, 2, 3, 2, 1)

    if (isPalindrome(a))
    {
        println("Массив является палиндромом")
    }
    else
    {
        println("Массив не является палиндромом")
    }
}

fun isPalindrome(array: IntArray): Boolean
{
    if (array.size <= 1)
    {
        return true
    }
    for (i in 0 until array.size / 2)
    {
        if (array[i] != array[array.size - i - 1])
        {
            return false
        }
    }
    return true
}