package doit_kotlin

class User(name: String) {

    constructor(name: String, age: Int): this(name) {
        println("보조 생성자가 사용되었습니다.")
    }
}

fun main() {
    val user = User("kim", 10)

    obj.someData = 30
    obj.someFun()
}

open class Super {
    open var someData = 10
    open fun someFun() {
        println("i am super class function : $someData")
    }
}

class Sub: Super() {
    override var someData = 20
    override fun someFun() {
        super.someFun()
        println("i am sub class function : $someData")
    }
}

val obj = object: Super() {
    override var someData = 20
    override fun someFun() {
        super.someFun()
        println("i am sub class function : $someData")
    }
}