fun main ()
{
    val x = true
    val y = true
    val z= false
    print ("не x и y= ${!x || z} \n")
    print ("x или не y= ${x || !y} \n")
    print ("x или у и z= ${ x || y && z} \n")

}