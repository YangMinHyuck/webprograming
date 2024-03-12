package kr.mjc.YMH

fun main() {
    val b: String? = "abc"
    val l: Int = b?.length ?: -1 // if (b != null) b.length else -1
    println(l)
}
