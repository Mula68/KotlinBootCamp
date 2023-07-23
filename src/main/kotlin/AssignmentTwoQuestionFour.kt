import kotlin.math.sqrt

fun main() {
//    QN: x3+7x2+10x = 0 => x2+7x+10

    val a = 1.0
    val b = 7.0
    val c = 10.0
    val d = sqrt(b*b-(4*a*c))
    println("d = $d")
    val x1 = (-b+d)/2*a
    val x2 = (-b-d)/2*a

    println("X1 = $x1")

    println("X2 = $x2")
}