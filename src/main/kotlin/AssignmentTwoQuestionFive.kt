fun main() {
    /*
    * A person moving to a village with a car moving at 20km/hr has many alternative routes. If he uses route 1 he
    * will move a distance of 5000km. if route2 d = 25000km. if route3 d = 50000km. if route4, d = 10000km.
    * find the time it will take him to reach the village using the separate routes;
    * -using an if statement
    * -using a wen statement
    */

//     Using if else statement


  /*  println("Enter distance of route to be taken from the keyboard")

    val distance = readln().toInt()

    val route1 = 5000
    val route2 = 25000
    val route3 = 50000
    val route4 = 10000

    val speed = 20

    if (distance == route1 ) {
        println("The time it will take to cover $route1 km is ${route1/speed} hours")

    } else if (distance == route2 ) {
        println("The time it will take to cover $route2 km is ${route2/speed} hours")

    } else if (distance == route3 ) {
        println("The time it will take to cover $route3 km is ${route3/speed} hours")

    } else if (distance == route4 ) {
        println("The time it will take to cover $route4 km is ${route4/speed} hours")

    } else {
        println("Invalid route ")
    }
    */


//    Using when statement

    println("Enter distance of route to be taken from the keyboard")

    val distance = readln().toInt()

    val speed = 20

    when(distance) {

        5000 -> println("The time it will take to cover 5000 km is ${5000/speed} hours")

        25000 -> println("The time it will take to cover 5000 km is ${25000/speed} hours")

        50000 -> println("The time it will take to cover 5000 km is ${50000/speed} hours")

        10000 -> println("The time it will take to cover 5000 km is ${10000/speed} hours")
    }
}