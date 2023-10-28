import kotlin.String

class Polymorphism {
}

fun main(args : Array<String>) {
    var a = Drink()
    a.drink()

    var b: Drink = Cola()
    b.drink()
    if(b is Cola) {
        b.washDishes()
    }
    var c = b as Cola
    c.washDishes()
    //변수 자체도 다운캐스팅됨
    b.washDishes()
}

open class Drink {
    var name = "음료"

    open fun drink() {
        println("${name} 를 마십니다.")
    }
}

class Cola: Drink() {

    var type = "콜라"
    override fun drink() {
        println("${name} 중에 ${type} 를 마십니다.")
    }

    fun washDishes() {
        println("${type}  로 설거지를 합니다.")
    }
}