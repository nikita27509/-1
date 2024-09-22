fun main()
{
    print("Введите строку: ")
    val inputString = readLine()!!
    println("Вывод символов строки с помощью while:")
    var i = 0
    while (i < inputString.length) {
        print("${inputString[i]} ")
        i++
    }
}