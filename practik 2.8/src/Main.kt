fun main ()
{
    val A = true
    val B = false
    val C = false
    print("не A и B= ${!A && B} \n")
    print("A или не B= ${A || !B} \n")
    print("А и В или С= ${A && B || C}")
}