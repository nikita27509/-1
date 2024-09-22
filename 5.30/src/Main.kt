fun main()
{
    print("Введите целое число: ")
    val decimal = readLine()!!.toInt()

    val binary = decimalToBinary(decimal)
    println("$decimal в двоичной системе: $binary")
}

fun decimalToBinary(decimal: Int): String
{
    if (decimal == 0)
    {
        return "0"
    }

    val binary = StringBuilder()
    var num = decimal

    while (num > 0)
    {
        val remainder = num % 2
        binary.insert(0, remainder)
        num /= 2
    }

    return binary.toString()
}