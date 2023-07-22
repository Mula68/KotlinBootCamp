fun main() {
//    Conditionals are expressions that evaluate to true or false

   /* if and if else conditionals
    println("Enter your birth year")

    val birthYear = readln().toInt()

    if (birthYear in 1996..2014) {
        println("You're a Gen Z!")
    } else {
        println("You're not a Gen Z!")
    }
*/

//    when conditionals

    /*val weather = readln()

    when(weather){
        "rainy" -> println("Ground is getting wet")
        "sunny" -> println("Let's go the beach")
        else -> println("Let's go jazz")
    }
*/
    println("Enter year of birth")
    val birthYear = readln().toInt()

    when(birthYear) {
       in 0..1959 -> println("Baby boomer")
        in 1956..1973 -> println("Gen X")
        in 1974..1995 -> println("Millennial")
        in 1996..2015 -> println("Gen Z")
        else -> println("Future")
    }

/*
* Assignment 2
* 1. solve: x2+10x+25 = 0; x = -b+-(sqrt(b2-4ac))/2a
*
* 2. A car is moving at a speed of 1000m/s at an acceleration of 25m/s2. Find the time it will take to move a distance of 5km
*
* 3. A person has four options of choosing between pizza, chicken, pancakes and cake. If they choose pizza they'll go to pizza hut,
* if chicken to kfc, if pancakes to food-hub and if cake they'll go to cakely. write a program using an if statement that captures a
* person's choice and prints selected restaurant.
* Re-write the same program using a when statement
*
* 4. x3+7x2+10x = 0
*
* 5. A person moving to a village with a car moving at 20km/hr has many alternative routes. If he uses route 1 he
* will move a distance of 5000km. if route2 d = 25000km. if route3 d = 50000km. if route4, d = 10000km.
* find the time it will take him to reach the village using the separate routes;
* -using an if statement
* -using a wen statement*/
}