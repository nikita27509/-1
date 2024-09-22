fun main()
{
    print("Введите расстояние в километрах: ")
    val km = readLine()!!.toDouble()

    print("Введите расстояние в футах: ")
    val feet = readLine()!!.toDouble()

    val metersKm = km * 1000
    val metersFeet = feet * 0.305

    if (metersKm < metersFeet)
    {
        println("$km км меньше, чем $feet футов.")
    }
    else if (metersKm > metersFeet)
    {
        println("$feet футов меньше, чем $km км.")
    }
    else
    {
        println("$km км равно $feet футам.")
    }
}