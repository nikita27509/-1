fun main()
{
    val x = false
    val y = false
    val z = true

    println("a) X или Y и не Z= ${x || y && !z}")
    println("b) не X и не Y= ${!x && !y}")
    println("c) не (X и Z) или Y= ${!(x && z) || y}")
    println("d) X и не Y или Z= ${x && !y || z}")
    println("e) X и (не Y или Z)= ${x && (!y || z)}")
    println("f) X или (не (Y или Z))= ${x || !(y || z)}")
}