fun main ()
{
        println ("Введите число: ")
    val number = readLine()?.toIntOrNull() ?: 0

    if (number != null)
    {
        println("Вы ввели число: $number")
    } else {
        println("Некорректный ввод.")
    }
}