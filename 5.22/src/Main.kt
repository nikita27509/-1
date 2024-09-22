import kotlin.random.Random

fun main() {
    val secretNumber = Random.nextInt(1, 101) // Генерируем случайное число
    var attempts = 0

    println("Угадай число")
    println("Я загадал число от 1 до 100")

    do {
        print("Введите ваше число: ")
        val guess = readLine()!!.toInt()
        attempts++

        if (guess < secretNumber) {
            println("мало")
        } else if (guess > secretNumber) {
            println("много")
        }
    } while (guess != secretNumber)

    println("Вы угадали число $secretNumber за $attempts попыток!")
}