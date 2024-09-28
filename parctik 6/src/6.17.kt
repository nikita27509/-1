fun main() {
    val a = intArrayOf(1, 6, 3, 7, 10)

    var sum = 0
    var pro = 1

    for (number in a) {
        sum += number
        pro *= number
    }

    println("Сумма элементов: $sum")
    println("Произведение элементов: $pro")
}