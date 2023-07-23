fun main() {
   /* A person has four options of choosing between pizza, chicken, pancakes and cake. If they choose pizza they'll go to pizza hut,
    * if chicken to kfc, if pancakes to food-hub and if cake they'll go to cakely. write a program using an if statement that captures a
    * person's choice and prints selected restaurant.
    * Re-write the same program using a when statement*/

    println("Enter choice of snack from keyboard")
    val snack = readln()

// using the if statement

    /*if (snack == "pizza") {
        println("Going to pizza hut")
    } else if (snack == "chicken") {
        println("Going to KFC")
    } else if (snack == "pancakes"){
        println("Going to food hub")
    } else if (snack == "cake") {
        println("Going to cakely")
    } else {
        println("Invalid choice")
    }*/

//    using when statement

    when(snack) {
        "pizza" -> println("Going to pizza hut")
        "chicken" -> println("Going to KFC")
        "pancake" -> println("Going to food hub")
        "cake" -> println("Going to cakely")
        else -> println("Invalid choice")
    }
}