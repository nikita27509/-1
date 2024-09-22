fun main ()
{
    println ("Введите число: ")
    val number = readLine()?.toIntOrNull() ?: 0

    if (number != null)
    {
        println("Вот такое число вы ввели: $number")
    } else {
        println("Некорректный ввод.")
    }
}