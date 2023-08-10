fun main() {

    addNumbers(10, 12)

   multiplyNumbers(13, 30)
}

//    functions in kotlin are declared using the 'fun' key word followed by a space then the function name
//    with a pair of parenthesis then followed by a pair of curly braces which hold the body of the function.

/*
fun addNumbers() {
    println(2 + 5)
}

fun multiplyNumbers(a: Int, b: Int) {
    val c = a * b
    println("The value of $a times $b is $c")
}
*/

// LAMBDAS

val addNumbers = {a: Int, b: Int -> println(a + b) }

val multiplyNumbers = {a: Int, b: Int -> println("The value of $a times $b is ${a* b}")}