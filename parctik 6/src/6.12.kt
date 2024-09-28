fun main()
{
    val a = intArrayOf(1, 2, 3, 4, 5)
    swapElements(a, 2, 4)
    println("Измененный массив: ${a.joinToString(", ")}")
}
fun swapElements(array: IntArray, index1: Int, index2: Int)
{
    if (index1 in array.indices && index2 in array.indices)
    {
        val temp = array[index1]
        array[index1] = array[index2]
        array[index2] = temp
    }
    else
    {
        println("Некорректные индексы")
    }
}