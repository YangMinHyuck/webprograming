package kr.mjc.YMH

class Example // Kotlin에는 최상위 클래스 Any가 있다. 암묵적으로 Any에서 상속 - Any()를 작성하지 않아도 있는거나 마찬가지다.

open class Base(val p: Int) // Kotlin 클래스는 기본적으로 final. 상속을 위해 open / 필드는 항상 private되어있는 상황

open class Derived(p: Int) : Base(p) // JAVA에서 볼때 Derived안에 super(p)가 있는거다

/* Overriding methods */
open class Shapea {
    open fun draw() {}      // 하위 클래스에서 메서드를 재정의 하려면 open (상속이나 오버라이딩을 하려면 항상 open을 사용해야 한다. 자바와는 반대로 항상 닫혀있는 상태)
    fun fill() {}           // open을 사용하지 않았기 때문에 오버라이딩 불가
}

class Rectanglea : Shapea() {
    override fun draw() {}  // 재정의 하는 메서드는 override
}

/* Overriding properties */
open class Shapeb {
    open val vertexCount: Int = 0 // 나 : 필드는 항상 private 이므로 아래의 vertexCount와 다른 vertexCount이다.
}

class Rectangleb : Shapeb() {
    override val vertexCount = 4
}

/* 파생 클래스 초기화 순서. 부모클래스부터 초기화 됨 */
open class Baseb(val name: String) {
    init {  // initializer block 은 primary constructor의 일부
        println("Initializing a base class")
    }

    // property initializer 는 primary constructor의 일부
    open val size: Int = name.length
}

class Derivedb(name: String, val lastName: String) : Baseb(name) {
    init {  // initializer block
        println("Initializing a derived class")
    }

    override val size: Int = super.size + lastName.length // property initializer
}

fun main() {
    val d = Derived(5)
    println(d.p)

    val e = Derived(29)
    println(e.p)

    val db = Derivedb("Timotheee", "YangMinHyuck")
    println(db.size)

    val c = Derivedb("dkfmaekdnsdlEKfdp", "rmatnrkdtksdpekrnsgkfdkqjwl")
    println(c.size)
}