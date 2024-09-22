fun main()
{
    print("Введите четырехзначное число: ")
    val number = readLine()!!.toInt()

    val thousandsDigit = number / 1000
    val hundredsDigit = (number % 1000) / 100
    val tensDigit = (number % 100) / 10
    val unitsDigit = number % 10

    val sumFirstTwo = thousandsDigit + hundredsDigit
    val sumLastTwo = tensDigit + unitsDigit

    println("Сумма первых двух цифр: $sumFirstTwo")
    println("Сумма последних двух цифр: $sumLastTwo")

    if (sumFirstTwo == sumLastTwo)
    {
        println("Сумма двух первых цифр равна сумме двух последних цифр.")
    }
    else
    {
        println("Сумма двух первых цифр не равна сумме двух последних цифр.")
    }

    val sumDigits = thousandsDigit + hundredsDigit + tensDigit + unitsDigit
    println("Сумма цифр: $sumDigits")

    if (sumDigits % 3 == 0)
    {
        println("Сумма цифр кратна 3.")
    }
    else
    {
        println("Сумма цифр не кратна 3.")
    }

    val productDigits = thousandsDigit * hundredsDigit * tensDigit * unitsDigit
    println("Произведение цифр: $productDigits")

    if (productDigits % 4 == 0)
    {
        println("Произведение цифр кратно 4.")
    }
    else
    {
        println("Произведение цифр не кратно 4.")
    }

    print("Введите число a: ")
    val a = readLine()!!.toInt()

    if (productDigits % a == 0)
    {
        println("Произведение цифр кратно $a.")
    }
    else
    {
        println("Произведение цифр не кратно $a.")
    }
}