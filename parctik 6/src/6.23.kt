import kotlin.random.Random
fun main()
{
    val numbers = IntArray(100) { Random.nextInt(1, 101) }

    for (i in 0..9)
    {
        val group = numbers.sliceArray(i * 10 until (i + 1) * 10)
        println("Группа ${i + 1}: ${group.joinToString(", ")}")
    }
}