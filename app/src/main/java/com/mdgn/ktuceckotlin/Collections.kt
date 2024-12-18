package com.mdgn.ktuceckotlin

// Lists

fun main() {
    // Immutable Lists (Degistirilemez)
    val fruits = listOf("Apple", "Banana", "Cherry")
    println(fruits[0])

    println("--------------------------")
    // Mutable Lists (Degistirilebilir)
    val numbers = mutableListOf(1,2,3)
    numbers.add(4)
    numbers.add(1)
    println(numbers)
    println("--------------------------")

    // Immutable Sets (Degistirilemez)
    val names = setOf("Nida", "Cagatay", "Funda")
    println(names)
    println(names.contains("Funda"))
    println(names.contains("Ali"))

    println("--------------------------")

    // Mutable Sets (Degistirilebilir)
    val uniqueNumbers = mutableSetOf(1,2,3)
    uniqueNumbers.add(2)
    uniqueNumbers.add(4)
    println(uniqueNumbers)

    val set1 = setOf(1,2,3,4)
    val set2 = setOf(3,4,5,6)
    val intersection = set1.intersect(set2)
    println(intersection)

    println("--------------------------")

    // Immutable Maps (Degistirilemez)
    val countryCodes = mapOf("TR" to "Turkey", "US" to "United States")
    println(countryCodes)
    println(countryCodes["TR"])
    println(countryCodes["US"])
    println(countryCodes["AR"])

    println("--------------------------")

    // Mutable Maps (Degistirilebilir)
    val scores = mutableMapOf("Hasan" to 79, "Bahar" to 55, "Cagatay" to 96)
    println(scores)
    scores.remove("Bahar")
    println(scores)
    scores.clear()
    println(scores)
    scores["Funda"] = 86
    println(scores)

    println("--------------------------")

    val names2 = mutableSetOf("Nida", "Cagatay", "Funda")
    println(names2)
    names2.remove("Nida")
    println(names2)

    println("--------------------------")

    // Filter

    val numbers2 = listOf(1,2,3,4,5,6,7)
    val evenNumbers = numbers2.filter { number ->
        number % 2 == 0
    }
    println(evenNumbers)

    val names3 = listOf("Nida", "Cagatay", "Funda")
    val longNames = names3.filter { name ->
        name.length > 4
    }
    println(longNames)

    val mixedNumber = listOf(-5, -3, 0, 3, 5)
    val negativeNumbers = mixedNumber.filter { number ->
        number < 0
    }
    println(negativeNumbers)
    val positiveNumbers = mixedNumber.filter { number ->
        number > 0
    }
    println(positiveNumbers)
    println("--------------------------")
    // Map

    val numbers4 = listOf(1,2,3)

    // Old way
    val newSquaredNumberList = mutableListOf<Int>()
    numbers4.forEach {
        val newSquaredNumber = it * it
        newSquaredNumberList.add(newSquaredNumber)
    }
    println(newSquaredNumberList)

    // new way
    val squaredNumber = numbers4.map { it * it }
    println(squaredNumber)

    val nameList = listOf("ikra", "cagatay")
    val capitalizedNames = nameList.map { it.capitalize() }
    println(capitalizedNames)
}




