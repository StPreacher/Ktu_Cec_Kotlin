package com.mdgn.ktuceckotlin

fun main() {
    val car = Car()
    car.brand = "Toyota"
    car.year = 2022
    println("${car.brand} - ${car.year}")

    println("---------------------------")

    val myPerson = Person()
    myPerson.setAge(27)
    println("My age is ${myPerson.getAge()}")

    println("---------------------------")

    val myUser = User()
    myUser.name = "Cagatay"
    myUser.age  = 11
    println(myUser)
    println("---------------------------")

    val myDog = Dog()
    val myCat = Cat()
    myDog.sound()
    myCat.sound()
}

// region Kalitim = Inheritance
open class Animal {

    open fun sound() {
        println("Animals makes a sound")
    }

}

class Dog : Animal() {

    override fun sound() {
        println("Hav")
    }

}

class Cat : Animal() {

    override fun sound() {
        println("Miyav")
    }

}
// endregion
// region Siniflar ve Nesneler
class Car {
    var brand: String = "Unknown"
    var year: Int = 0
}
// endregion
// region Kapsulleme
class Person {
    private var age: Int = 0

    fun setAge(age: Int) {
        this.age = age
    }

    fun getAge() : Int {
        return this.age
    }

}
// endregion
// region Veri Siniflari - Data Class
data class User(var name: String = "Unknown", var age: Int = 33)
// endregion





























