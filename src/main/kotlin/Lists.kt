fun main() {
//    qn1: create a list of ten integers and print them out in ascending order

    val numbers = listOf(89, 45, 23, 5, 67, 12, 55, 89, 54, 55)

//    println(numbers.sorted())

//    qn2: assuming a group A contains elements {a, b, c, d, a, g, r, f}, group B contains {ant, bee, elephant, dog, cat}
//    create a map that links the two groups using their first characters.

    val keys = listOf('a', 'b', 'c', 'd', 'e', 'g', 'r', 'f')
    val values = listOf("ant", "bee", "elephant", "dog", "cat")

    val animals: MutableMap<Char, String> = mutableMapOf()

    for (i in keys) {
        for (j in values) {
            j.toCharArray()
            if (i == j[0]) {
                animals[i] = j
            }
        }
    }

    println(animals.keys)

//    qn3: add five entries that map five unique characters to the respective animal name

//    animals.putAll(setOf('g' to  "giraffe", 'h' to "hyena", 'k' to "kob", 'l' to "lion", 'm' to "monkey"))
//
//    println(animals)
}