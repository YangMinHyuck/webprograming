package kr.mjc.YMH

/* properties는 private field와 getter/setter 로 되어 있음 */
class Address {
    var name: String = "Holmes, Sherlock" // var가 사용되어서 get과set이 다 포함되어 있다
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"
}

class Rectanglec(val width: Int, val height: Int) {
    val area: Int // fun Getarea : int를 사용하는 것과 같음 하지만 Getarea를 사용할 경우 아래에서 properti를 사용하지 못하고 Getarea를 사용해줘야 함
        get() = this.width * this.height // 사용자 지정 getter
}

class Circlee(var x: Int = 0, var y: Int = 0) { // Circle이라는 파일?이 있어서 Circlee이라는 클래스로 생성
    var radius: Int = 1   // property initializer
        set(value) {        // 사용자 지정 setter
            field = if (value >= 0) value else throw RuntimeException("반지름이 0 미만")
        } // `field`를 backing field라 한다.

    override fun toString() = "Circlee(x=$x, y=$y, radius=$radius)"
}

fun main() {
    val address = Address()
    println(address.name) //address와 getName이 있는거다.

    val r = Rectanglec(3, 4)
    println("width=${r.width}, height=${r.height}, area=${r.area}")

    val c = Circlee(5, 5)
    println(c)
    c.radius = -5
    println(c)
}