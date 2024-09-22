fun main()
{
    print("введиет десятичное число=")
    val x: Number = readLine()!!.toDouble()
    val format = String.format("%.2f", x)
    println ("число: $format")
}