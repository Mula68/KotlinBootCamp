fun main() {
//    Kotlin's collections include: Lists, Sets and Maps. These can be mutable or non-mutable and can store values of
//    different data-types

    /* 1. Lists */

    val ugandaCities = listOf("Kampala", "Mbarara", "Fortportal", "Masaka", "Gulu")

    println("Uganda Cities:")

    ugandaCities.forEach {
        println(it)
    }

    val computerBrands = mutableListOf("HP", "Dell", "Lenovo", "Acer")

    computerBrands.add("Apple")
    computerBrands.add("Asus")
    computerBrands.add("Samsung")
    computerBrands.add("Toshiba")

    computerBrands.remove("Acer")

    println("Computer Brands:")

    for (brand in computerBrands.sorted()) {
        println(brand)
    }

    val mixedList = listOf(2, 'a', "Kotlin", "Chicken", 100, true, 0.75)

    mixedList.forEach {
        println(it)
    }


    /* 2. Sets :: these are unordered collections that do not support duplicate values */

    val mySet = setOf(1, "two", 2, 1, true, "two")

    mySet.forEach {
        println(it)
    }
//    Sets can also be mutable or non-mutable


    /* Maps */


    val animals: MutableMap<Char, String> = mutableMapOf('a' to "ant", 'b' to "bee", 'c' to "cat", 'd' to "dog", 'e' to  "elephants")

    println(animals)
    

    animals.putAll(setOf('g' to  "giraffe", 'h' to "hyena", 'k' to "kob", 'l' to "lion", 'm' to "monkey"))

    println(animals)

}