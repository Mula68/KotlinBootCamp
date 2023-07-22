import kotlin.math.sqrt
fun main() {
    /*
    * Variables are data placeholders or containers
    * Kotlin variables are normally declared using either val or var
    * val is used to declare non mutable variables
    * var is used to declare mutable variables
     */
    val name: String = "Peter"
    var msg: String = "Hello, my name is $name"
    println(msg)

//    Mutating or changing the value of msg

    msg = "Yaay! happy birthday $name"

    println(msg)

    /*
    *Kotlin type inference
    *This basically means Kotlin automatically detects the type of variable by the value assigned to it
     */

    val number1 = 2
    val number2 = 5
    val number3 = number1 * number2

    println("The product of $number1 and $number2 is $number3")

//    Assignment
//    1: Calculate age
//    2: c2 = a2 + b2; If a right-angled triangle has a base of 4cm and height of 3cm, find the hypotenuse

    val birthYear = 1997
    var currentYear = 2023
    val age = currentYear - birthYear

    println("You're $age years old")

//    Question 2: We first import the square root function through the Math object at the top of the program

    val base = 4
    val height = 3
    val hypotenuse = sqrt((base*base + height*height).toDouble())
    println("The length of the hypotenuse is $hypotenuse")
}