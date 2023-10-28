import kotlin.String

class StringPractice {
}

fun main(args : Array<String>) {
    val test1 = "Test.Kotlin.String"
    println(test1.length)

    println(test1.lowercase())
    println(test1.uppercase())

    val test2 = test1.split(".")
    println(test2)

    println(test2.joinToString())
    println(test2.joinToString("-"))

    println(test1.substring(5..10))

    val nullString: String? = null
    val emptyString = ""
    val blankString = " "
    val normalString = "a"

    println(nullString.isNullOrEmpty())
    println(emptyString.isNullOrEmpty())
    println(blankString.isNullOrEmpty())
    println(normalString.isNullOrEmpty())

    println(nullString.isNullOrBlank())
    println(emptyString.isNullOrBlank())
    println(blankString.isNullOrBlank())
    println(normalString.isNullOrBlank())

    var test3 = "kotlin.kt"
    var test4 = "java.java"

    println(test3.startsWith("java"))
    println(test4.startsWith("java"))

    println(test3.endsWith(".kt"))
    println(test4.endsWith(".kt"))
}