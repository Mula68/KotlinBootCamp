//write a function that has three parameters; two doubles and one character
//(*, +, -, /) and checks if third parameter
// == *, it will multiply the two doubles
// == +, it will add the two numbers
// == -, it will subtract the two numbers
// == /, it will divide the two numbers

fun main() {
    println("Enter two numbers and desired operator from the keyboard to perform a calculation")

    mathOperations(readln().toDouble(), readln().toDouble(), readln())
}

fun mathOperations(a: Double, b: Double, c: String) {
    val result: Double
    if (c == "*") {
        result = a * b
        println("The result of $a $c $b is $result")
    } else if (c == "+") {
        result = a + b
        println("The result of $a $c $b is $result")
    } else if (c == "-") {
        result = a - b
        println("The result of $a $c $b is $result")
    } else if (c == "/") {
            result = a / b
            println("The result of $a $c $b is $result")
        } else {
            println("Invalid entry")
        }

}