package com.mdgn.ktuceckotlin

fun main() {
    // For Loop
//    for (item in collection) {
//
//    }

    val nameList = listOf("Yakup", "Taha", "Nida")
    for (name in nameList) {
        println(name)
    }

    println("-------------------------------")

    for (number in 1..5) {
        println(number)
    }

    println("-------------------------------")

    for (number in 5 downTo 1) {
        println(number)
    }

    println("-------------------------------")

    for (number in 1 until 5) {
        println(number)
    }

    println("-------------------------------")

    for (number in 1..2) {
        for (number2 in 1..3) {
            println("number1 = $number")
            println("number2 = $number2")
        }
    }

    println("-------------------------------")

    // While loop
//
//    while (condition) {
//        // islem
//    }

    var count = 0
    while (count < 10) {
       println("Sayac = $count")
        count++
    }

    println("-------------------------------")

    // Do-While loop
    var number: Int
    do {
        println("Bir pozitif sayi girin:")
        number = readlnOrNull()?.toInt() ?: -1
    } while (number <= 0)
    println("girdiginiz pozitif sayi: $number")

    println("-------------------------------")

    var number2 = 5
    var numberIsLowerThan10 = number2 < 10

    while (numberIsLowerThan10 && number2 != 7) {
        println(number2)
        number2++
    }

    println("-------------------------------")

    // Break & Continue

    for (a in 1..10) {
        if (a == 5) {
            println("Number was find = $a")
            break
        }
        println("Checking = $a")
    }

    println("-------------------------------")

    for (i in 1..10) {
        if (i % 2 == 0) {
            continue
        }
        println("tek sayi = $i")
    }

    println("-------------------------------")

    cagatay@ for (x in 1..3) {
        for (y in 1..3) {
            if (x == y) {
                println("x = $x ve  y = $y dongusunden cikiliyor")
                break@cagatay
            }
        }
    }

    println("-------------------------------")

}