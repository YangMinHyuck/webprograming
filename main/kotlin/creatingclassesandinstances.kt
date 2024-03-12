package kr.mjc.YMH

open class Shape

class Rectangle(val height: Double, val length: Double) : Shape() {
    val perimeter = (height + length) * 2 // property initializer
}

fun main() {
    val rectangle = Rectangle(5.0, 2.0) // new를 사용하지 않는다.
    println("The perimeter is ${rectangle.perimeter}")
}