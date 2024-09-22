fun main()
{
    print("Введите первое число: ")
    val num1 = readLine()!!.toInt()
val tens = num1 / 10
    val units = num1 % 10
    val sum = tens + units
    val product = tens * units
    print ("десятки: $tens \n")
    print ("единицы: $units \n")
    print ("сложение: $sum \n")
    print ("умножение: $product")
}