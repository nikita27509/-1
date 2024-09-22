fun main () {
    print("Введиет первое число= ")
    val x = readLine()!!.toInt()
    println(" первое число= $x")
    print("Введиет второе число= ")
    val y = readLine()!!.toInt()
    println(" Второе число= $y")
    print("Введиет второе число= ")
    val z = readLine()!!.toInt()
    println(" Третье число= $z")
    val max = maxOf (x,y,z)
    println("Максимальное число= $max")
}