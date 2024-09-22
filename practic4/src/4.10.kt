fun main()
{
    print("Введите способ оплаты (наличные, карта, PayPal): ")
    val pay = readLine()!!.lowercase()

    when (pay)
    {
        "наличные" -> println("Оплата наличными.")
        "карта" -> println("Оплата кредитной картой.")
        "paypal" -> println("Оплата через PayPal.")
        else -> println("Неверный способ оплаты.")
    }
}