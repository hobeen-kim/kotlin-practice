abstract class Abstract {
}

fun main(args : Array<String>) {

}

abstract class Animal3 {

    abstract fun eat()

    fun sniff() {
        println("킁킁")
    }
}

class Rabbit : Animal3() {
    override fun eat() {
        println("당근을 먹습니다")
    }
}