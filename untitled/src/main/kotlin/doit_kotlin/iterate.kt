package doit_kotlin

fun main() {
    var data = listOf(10, 20, 30)

    for((i, v) in data.withIndex()) {
        println("$i : $v")
    }
}