package com.mdgn.ktuceckotlin

fun main() {
    val myName = "Selman"
    greet(myName)
    greet()
    println(getGreetingMessage(myName))
    println("--------------------------")
    displayInfo("Emir", 22, "Istanbul")
    println(displayRectArea(15, 78))
    println(displayRectArea2(4, 5))
    println("--------------------------")
    val number = 3
    val strRepeated = number.times("Enes")
    println(strRepeated)
    val addResult = number add 43
    println(addResult)
    val concatResult = "Ekram".concat("Bahar")
    println(concatResult)
    println("--------------------------")
    printAll("Hello", "World", "Android")

    println("--------------------------")
    var myNumber = 10
    myNumber = multiply(myNumber)
    println(myNumber)

    var number2: Int
}
//Last dance

fun multiply(number: Int): Int {
    return number * 5
}


// Vararg Parameters
fun printAll(vararg messages: String) {
    for (a in messages) {
        println(a)
    }
}

// Infix Method
infix fun Int.times(string: String): String {
    val result = string.repeat(this)
    return result
}

infix fun Int.add(x: Int) = this + x

infix fun String.concat(other: String) = this + other

// Named Arguments
fun displayInfo(name: String, age: Int, country: String) {
    println("$name, $age yasinda ve $country de dogdu")
}

fun displayRectArea(width: Int, height: Int) : Int {
    val area = width * height
    return area
}

fun displayRectArea2(width: Int, height: Int) = width * height

// Default Functions
fun greet(name: String = "Emir") {
    println("Welcome $name")
}

fun getGreetingMessage(name: String): String {
    val greetingMessage = "Welcome $name"
    return greetingMessage
}

//fun functionName(functionParameter): List {
//
//}