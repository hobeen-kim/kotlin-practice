@file:Suppress("UNUSED_EXPRESSION")

class LateInit {
}

fun main() {

    val a = lateInitSample()
    println(a.getLateInitText())
    a.text = "text"
    println(a.getLateInitText())

    val number: Int by lazy {
        println("초기화를 합니다.")
        7
    }

    println("코드를 시작합니다.")
    println(number)
    println(number)

}

class lateInitSample {
    lateinit var text: String

    fun getLateInitText(): String {
        if(::text.isInitialized) return text
        else return "default"
    }
}