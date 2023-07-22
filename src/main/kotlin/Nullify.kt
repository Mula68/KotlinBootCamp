fun main() {
//    Nullable: a variable that store a value and can still exist when it has no value passed to it

    /*println("Enter value from keyboard")
    readLine()*/

   /* println("Enter first number from the keyboard")

    val a = readln().toInt()
    println(a)

    println("Enter second number from the keyboard")

    val b = readln().toInt()
    println(b)

    val sum = a + b
    println("sum of $a and $b is $sum")*/

//    println("Enter first number from the keyboard")

//    val a = readln()

//    val a = readLine()

//    val a = readlnOrNull()

//    println(a)

//    conclusion:
//    readln() returns a string that is not nullable
//    readLine() and readlnOrNull() return nullable strings

//    Nullable variables declaration

    var firstName:String ?= null

    println("firstName is $firstName")

    firstName = "Peter"

    println("firstName is now $firstName\nTherefore fisrtName is nullable")

}