package person

import bicycle.Bicycle

class Person(val name: String, val age: Int)

class Cyclist(name: String, age: Int) extends Person(name, age) {
    def rideBicycle(bicycle: Bicycle): Unit = println("Yay! It is so fun to ride a bike!")
    def complains(): Unit = println("This bike sucks!")
}