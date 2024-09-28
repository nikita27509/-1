fun main() {
    val a = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 18, 21)

    println("Числа, делящиеся на 3:")
    for (number in a) {
        if (number % 3 == 0) {
            print("$number ")
        }
    }
}