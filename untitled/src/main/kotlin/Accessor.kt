class Accessor {
}

fun main() {

    val a = "함수 스코프"
    println(a)
    B().print()

}

val a = "패키지 스코프"

class B {
    val a = "클래스 스코프"
    fun  print() {
        println(a)
    }
}