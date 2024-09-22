fun main()
{
    print("Введите число: ")
    val number = readLine()!!.toDouble()
    print("Введите степень: ")
    val stepen = readLine()!!.toInt()
val result = Math.pow( number,stepen.toDouble())
    print ("результат : $result")
    }