package doit_kotlin

class initial {
    lateinit var data4: String
    val data5: Int = 10
}

fun main() {
    lateinit var data1: String

    data1 = "hello"

    val data2: Int by lazy {
        println("초기화를 합니다.")
        7
    }

    println(data2)
    println(data2)
}