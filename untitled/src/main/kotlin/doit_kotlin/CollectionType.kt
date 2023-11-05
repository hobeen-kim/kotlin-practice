package doit_kotlin

fun main() {
    val data1: Array<Int> = Array(3) { 0 }

    println(data1[1])

    data1.set(1, 1)

    println(data1[1])

    data1[1] = 2

    println(data1[1])

    val data2: List<Int> = listOf(1, 2, 3, 4, 5)

    println(data2[0])

    val data3 = intArrayOf(1, 2, 3, 4, 5)

    var map = mapOf<String, String>(Pair("one", "1"), Pair("two", "2"), "three" to "3")
    println("""
        ${map["one"]}
        ${map["two"]}
        ${map["three"]}
    """.trimIndent())
}