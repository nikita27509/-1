fun main ()
{
    print("Введите количество элементов в массиве= ")
    val a = (1..readLine()!!.toInt())

    for (b in a)
    {
        print("$b\n")

    }
    print ("сумма элементов=${ a.sum()}")
}