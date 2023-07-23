import kotlin.math.sqrt
fun main() {
//    solve: x2+10x+25 = 0; Hint: x = -b+-(sqrt(b2-4ac))/2a
    val a: Double = 1.0
    val b: Double = 10.0
    val c: Double = 25.0
    val d = sqrt(b*b-(4*a*c))
    println("d = $d")
    val x1 = (-b+d)/2*a
    val x2 = (-b-d)/2*a

    println("X1 = $x1")

    println("X2 = $x2")
}