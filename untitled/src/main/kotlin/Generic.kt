import kotlin.String

class Generic {
}

fun main(args : Array<String>) {
    UsingGeneric(A()).doShouting()
    UsingGeneric(A2()).doShouting()
    UsingGeneric(A3()).doShouting()

    doShouting(A2())
}

fun <T: A> doShouting(t: T) {
    t.shout()
}

open class A {
    open fun shout() {
        println("A 가 소리칩니다.")
    }
}

class A2 : A() {
    override fun shout() {
        println("A2 가 소리칩니다.")
    }
}

class A3 : A() {
    override fun shout() {
        println("A3 가 소리칩니다.")
    }
}

class UsingGeneric<T: A> (val t: T) {
    fun doShouting() {
        t.shout()
    }
}

