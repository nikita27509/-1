import java.time.LocalDate
import java.time.YearMonth

fun main()
{
    print("Введите год: ")
    val year = readLine()!!.toInt()

    print("Введите месяц (число от 1 до 12): ")
    val month = readLine()!!.toInt()

    val yearMonth = YearMonth.of(year, month)
    val daysInMonth = yearMonth.lengthOfMonth()

    println("Даты в месяце $month/$year:")
    for (day in 1..daysInMonth)
    {
        val date = LocalDate.of(year, month, day)
        println(date)
    }
}