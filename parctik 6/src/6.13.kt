import kotlin.random.Random
fun main()
{
    val a = IntArray(20)
    for (i in a.indices)
    {
        a[i] = Random.nextInt(1, 101)
    }
    println("Массив случайных чисел: ${a.joinToString(", ")}")
}