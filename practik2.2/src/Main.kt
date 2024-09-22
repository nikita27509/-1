fun main()
{
    print("Введите первое число: ")
    val num1 = readLine()!!.toInt()
    val tens = (num1 / 10) % 10
    val units = num1 % 10
    val hundreds = num1 / 100
    val sum = hundreds + tens + units
    val product = hundreds * tens * units
    print ("десятки: $tens \n")
    print ("единицы: $units \n")
    print ("сложение: $sum \n")
    print ("умножение: $product")
}