fun main() {
//    Non-primitive arrays:: -store elements of different data types

    val firstArray = arrayOf("Peter", "Edward", "Ronald", "Lawrence", "John", 1, true, 'a')

//    Primitive arrays:: -store elements of only a single data type

    val secondArray = Array<Int>(10) { 0 }   /* this creates an array of 10 integers initialized to zero */

//    println("The value at index 3 of the second array is ${ secondArray[3] }")

    secondArray[3] = 26

//    println("The value at index 3 of the second array has changed to ${ secondArray[3] }")

//    Looping through arrays

//    for(item in secondArray) {
//        println(item)
//    }

//    Qn1: create an array of 50 integers and use a for loop to print the names of the integers

        val integerNumbers = Array<Int>(50) { it }

        val integerNames = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                 "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
                "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six","twenty seven",
                "twenty eight", "twenty nine", "thirty", "thirty one", "thirty two", "thirty three", "thirty four",
                "thirty five", "thirty six", "thirty seven", "thirty eight", "thirty nine", "forty", "forty one",
                "forty two", "forty three", "forty four", "forty five", "forty six", "forty seven", "forty eight",
                "forty nine", "fifty")

    for (i in integerNumbers.indices) {
        if (integerNumbers[i] <= 50) {
            println(integerNames[i])
        }
    }

//    Qn2: Create an array of six Doubles and print out the sum of all elements in the array

    val doubles = arrayOf(0.25, 0.5, 0.75, 1.0, 1.25, 1.5 )
     println(doubles.sum())

//    Qn3: In a class there are five students Ivan, Aron, Grace, Nisa, Christine. Create an array in this order and afterwards print
//    the array elements in alphabetical order

    val students = arrayOf("Ivan", "Aron", "Grace", "Nisa", "Christine")

    println(students.sorted())

}