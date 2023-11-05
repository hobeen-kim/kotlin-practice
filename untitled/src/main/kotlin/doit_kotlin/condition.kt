package doit_kotlin

fun main() {
    var data = 10
    val result = if (data > 0) {
        println("data > 0")
        true
    } else {
        println("data <= 0")
        "hello"
    }

    println(result is String)
    println(result is Boolean)

    println(result)

    println("-------------------")

    var data2: Any = 10

    when (data2) {
        1 -> println("data == 1")
        2 -> println("data == 2")
        else -> {
            println("data is not 1 and 2")
        }
    }

    when (data2) {
        is String -> println("data is String")
        20, 30 -> println("data == 20 or data == 30")
        in 1..10 -> println("data is in 1..10")
        else -> println("data is not valid")
    }
}