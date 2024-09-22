fun main()
{
    val a = true
    val b = false
    val c = false
    println("a) A или не (A и B) или C= ${a || !(a && b) || c}")
    println("b) не A или A и (B или C)= ${!a || a && (b || c)}")
    println("c) (A или B и не C) и C= ${(a || b && !c) && c}")
}