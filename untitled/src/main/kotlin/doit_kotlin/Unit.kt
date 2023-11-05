package doit_kotlin

fun main() {
    val data1: Unit = cal()

    println(data1)

    fun some(data1: Int, data2: Int = 10) {
        println(data1 + data2)
    }

    some(10)
    some(10, 20)
    some(
        data1 = 10,
        data2 = 30
    )
}

fun cal(): Unit {
    println(10 + 20)
}