fun main ()
{
    println("введите число=")
    for (a in 1.. readLine()!!.toInt())
    {
        val n =a.toInt()
      val sum = (1 .. a).sum()
    println("вывод= $sum")
    }
}