fun main()
{
    print("Введите длину первой стороны: ")
    val side1 = readLine()!!.toDouble()

    print("Введите длину второй стороны: ")
    val side2 = readLine()!!.toDouble()

    print("Введите длину третьей стороны: ")
    val side3 = readLine()!!.toDouble()

    if (isTriangle(side1, side2, side3)) {
        println("Треугольник с такими сторонами может существовать.")
    } else {
        println("Треугольник с такими сторонами не может существовать.")
    }
}

fun isTriangle(a: Double, b: Double, c: Double): Boolean
{
    return a + b > c && a + c > b && b + c > a
}